public static void createPermutations(java.lang.String choiceRorC) throws java.io.IOException {
    source.ADFGX.constructAlphabet();
    java.io.BufferedWriter writer = source.Resources.openFile_Writer("adfgxPermutations");
    source.Alphabet.permutateLists(writer, choiceRorC);
    source.Resources.closeFile(writer, "adfgxPermutations");
}