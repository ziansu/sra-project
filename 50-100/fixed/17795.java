public java.util.List<co.rsk.scoring.InetAddressBlock> getAddressBlockList() {
    if ((this.blocks.size()) == 0)
        return new java.util.ArrayList<>();
    
    co.rsk.scoring.InetAddressBlock[] bs = this.blocks.toArray(new co.rsk.scoring.InetAddressBlock[0]);
    java.util.List<co.rsk.scoring.InetAddressBlock> list = new java.util.ArrayList(bs.length);
    for (co.rsk.scoring.InetAddressBlock inetAddressBlock : bs) {
        list.add(inetAddressBlock);
    }
    return list;
}