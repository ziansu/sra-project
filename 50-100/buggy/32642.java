public static void findLongestWord(java.util.Scanner scanner) {
    java.lang.System.out.println(("This program will ask you to enter a sentence, and" + " then it will tell you the longest word in that sentence."));
    java.lang.System.out.println("Please enter a sentence:");
    java.lang.String string = scanner.nextLine();
    java.lang.String longestWord = "";
    java.lang.String[] stringArray = string.split(" ");
    for (java.lang.String testString : stringArray) {
        if ((longestWord.length()) < (testString.length())) {
            longestWord = testString;
        }
    }
    java.lang.System.out.println(("The longest word in the sentence is: " + longestWord));
}