public static void searchFeature(java.util.Scanner userInput, java.util.Set<java.lang.String> hamletText) {
    while (true) {
        java.lang.System.out.print("Give me a word and I will see if it is in Hamlet. > ");
        java.lang.String userWord = userInput.next();
        if (hamletText.contains(userWord)) {
            java.lang.System.out.println((userWord + " is in Hamlet!"));
        }else {
            java.lang.System.out.println((userWord + " is not in Hamlet."));
        }
    } 
}