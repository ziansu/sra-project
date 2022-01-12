public static guttmanlab.core.annotation.Annotation.Strand consensusStrand(guttmanlab.core.annotation.Annotation.Strand strand1, guttmanlab.core.annotation.Annotation.Strand strand2) {
    guttmanlab.core.annotation.Annotation.Strand rtrn = guttmanlab.core.annotation.Annotation.Strand.INVALID;
    if ((strand1.equals(guttmanlab.core.annotation.Annotation.Strand.BOTH)) || (strand1.equals(guttmanlab.core.annotation.Annotation.Strand.UNKNOWN))) {
        rtrn = strand2;
    }
    if ((strand2.equals(guttmanlab.core.annotation.Annotation.Strand.BOTH)) || (strand2.equals(guttmanlab.core.annotation.Annotation.Strand.UNKNOWN))) {
        rtrn = strand1;
    }
    if (strand1.equals(strand2)) {
        rtrn = strand1;
    }
    return rtrn;
}