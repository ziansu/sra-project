public int getQueryUniprotPosForPDBPos(int resser) {
    int alnIdx = alnPdb2Uniprot.getQuery().getAlignmentIndexAt(resser);
    if (alnPdb2Uniprot.hasGap(alnIdx)) {
        return -1;
    }
    int uniprotPos = alnPdb2Uniprot.getIndexInTargetAt(alnIdx);
    int pos = uniprotPos - ((queryInterv.beg) - 1);
    if ((pos <= 0) || (pos > (queryInterv.getLength())))
        return -1;
    
    return pos;
}