public static void main(java.lang.String[] args) {
    java.lang.String userInput = day4work.PigLatin.getUserInput();
    java.lang.System.out.println(((("The word " + userInput) + " in pig latin is ") + (day4work.PigLatin.translator(userInput))));
}