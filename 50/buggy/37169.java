public byte[] toBytes() {
    byte[] answer = new byte[org.harctoolbox.harchardware.comm.EthernetAddress.noBytes];
    java.lang.System.arraycopy(data, org.harctoolbox.harchardware.comm.EthernetAddress.noBytes, answer, 0, org.harctoolbox.harchardware.comm.EthernetAddress.noBytes);
    return answer;
}