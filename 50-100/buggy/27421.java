public boolean contains(java.net.InetAddress address) {
    if (this.addresses.contains(address))
        return true;
    
    co.rsk.scoring.InetAddressBlock[] bs = ((co.rsk.scoring.InetAddressBlock[]) (this.blocks.toArray()));
    for (co.rsk.scoring.InetAddressBlock mask : bs)
        if (mask.contains(address))
            return true;
        
    
    return false;
}