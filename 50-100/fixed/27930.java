public void add(byte[] anchor, byte[] indel, int indelstart, bamfo.utils.BamfoRecord b2r, int indexonread, boolean insertion) {
    if (indexonread >= (b2r.pos.length)) {
        return ;
    }
    add(anchor, indel, indelstart, b2r.mapquality, b2r.record.getReadNegativeStrandFlag(), indexonread, b2r.readlength, b2r.recordname, ((b2r.pos[indexonread]) > (b2r.overlapstart)), insertion);
}