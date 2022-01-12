public static boolean yesNoPrompt(java.lang.String prompt) {
    java.util.Scanner reader = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println((prompt + " (y/n)"));
    java.lang.String result = reader.nextLine();
    if (result.equals("y")) {
        return true;
    }else
        if (result.equals("n")) {
            return false;
        }else {
            java.lang.System.out.println("Not in proper format... please try again.");
            return Model.yesNoPrompt(prompt);
        }
    
}