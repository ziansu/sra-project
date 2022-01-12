public java.util.List<co.rsk.scoring.InetAddressBlock> getAddressBlockList() {
    co.rsk.scoring.InetAddressBlock[] bs = ((co.rsk.scoring.InetAddressBlock[]) (this.blocks.toArray()));
    java.util.List<co.rsk.scoring.InetAddressBlock> list = new java.util.ArrayList(bs.length);
    for (co.rsk.scoring.InetAddressBlock inetAddressBlock : bs) {
        list.add(inetAddressBlock);
    }
    return list;
}