public static void main(java.lang.String[] args) {
    java.util.List<com.epam.doshekenov.entity.Word> words = com.epam.doshekenov.Runner.makeList(com.epam.doshekenov.Runner.STRINGS_TXT);
    com.epam.doshekenov.entity.ConsonantsSorter.print(words);
    com.epam.doshekenov.entity.ConsonantsSorter.bubbleSort(words);
    com.epam.doshekenov.entity.ConsonantsSorter.print(words);
}