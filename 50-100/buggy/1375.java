public static java.lang.String getSequence2Tale(java.lang.String tale) {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    java.lang.String[] taleSequence = tale.split("(?<=\\G..)");
    for (java.lang.String currTale : taleSequence) {
        de.uni_hannover.igem.model.Tale taleEnum = de.uni_hannover.igem.model.Tale.valueOf(currTale.toUpperCase());
        de.uni_hannover.igem.model.Base base = de.uni_hannover.igem.model.Base2Tale.getBase2Tale(taleEnum);
        sb.append(base.name());
    }
    return sb.toString();
}