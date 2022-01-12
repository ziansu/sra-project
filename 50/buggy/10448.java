protected void trim(int n) {
    nucleotideSequence = nucleotideSequence.substring(0, ((nucleotideSequence.length()) - (1 + n)));
}