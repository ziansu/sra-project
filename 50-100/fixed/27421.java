public boolean contains(java.net.InetAddress address) {
    if (this.addresses.contains(address))
        return true;
    
    if ((this.blocks.size()) == 0)
        return false;
    
    co.rsk.scoring.InetAddressBlock[] bs = this.blocks.toArray(new co.rsk.scoring.InetAddressBlock[0]);
    for (co.rsk.scoring.InetAddressBlock mask : bs)
        if (mask.contains(address))
            return true;
        
    
    return false;
}