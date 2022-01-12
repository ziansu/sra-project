public java.lang.String randomKnucks() {
    java.lang.String knucksToShow = "";
    while ((knucksToShow.length()) < 2) {
        java.util.Random rand = new java.util.Random();
        java.lang.String wordsToChooseFrom = wordList().toString();
        java.lang.String randomWord = rand.nextInt(wordsToChooseFrom.length);
        knucksToShow = (knucksToShow + randomWord) + " ";
    } 
    return knucksToShow;
}