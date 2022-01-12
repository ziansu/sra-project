private void writeDns(nl.sidn.pcap.support.PacketCombination p) {
    writeOK = dnsWriter.checkFilterDomainList();
    if (writeOK) {
        dnsWriter.write(p);
        (counter)++;
        (totalCounter)++;
        (dnsWritten)++;
        if ((counter) >= (parquetMaxPackets)) {
            dnsWriter.close();
            dnsWriter.open();
            counter = 0;
        }else {
            (dnsFiltered)++;
        }
    }
}