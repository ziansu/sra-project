public static java.util.List<de.uni_hannover.igem.model.Base> getSequenceList2Tale(java.lang.String tale) {
    java.util.List<de.uni_hannover.igem.model.Base> baseSequence = new java.util.ArrayList<de.uni_hannover.igem.model.Base>();
    java.lang.String[] taleSequence = tale.split("(?<=\\G..)");
    for (java.lang.String currTale : taleSequence) {
        de.uni_hannover.igem.model.Tale taleEnum = de.uni_hannover.igem.model.Tale.valueOf(currTale.toUpperCase());
        de.uni_hannover.igem.model.Base base = de.uni_hannover.igem.model.Base2Tale.getBase2Tale(taleEnum);
        baseSequence.add(base);
    }
    return baseSequence;
}