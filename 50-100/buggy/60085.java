public void calculateExtraBase(final com.bina.varsim.types.variant.Sequence refSeq) {
    for (final com.bina.varsim.types.variant.FlexSeq alt : _alts) {
        if ((alt.isSeq()) && ((alt.length()) == 0)) {
            extraBase = java.lang.String.valueOf(((char) (refSeq.byteAt(((getPos()) + (_del))))));
        }
    }
}