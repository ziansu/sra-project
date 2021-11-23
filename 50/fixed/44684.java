public static final java.lang.String convertNucleotideToAminoAcid(java.lang.String nucleotideSequence, int startingPosition, int length, boolean reverse, pal.datatype.CodonTable translator) {
    return new java.lang.String(pal.datatype.CodonTableUtils.convertNucleotideToAminoAcid(nucleotideSequence.toCharArray(), startingPosition, length, reverse, translator));
}