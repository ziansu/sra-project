public static final java.lang.String convertNucleotideToAminoAcid(java.lang.String nucleotideSequence, int startingPosition, int length, boolean reverse, pal.datatype.CodonTable translator) {
    return pal.datatype.CodonTableUtils.convertNucleotideToAminoAcid(nucleotideSequence.toCharArray(), startingPosition, length, reverse, translator).toString();
}