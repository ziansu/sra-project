public void isName(java.lang.String userInput) {
    spaces = 0;
    for (int s = 0; s < (userInput.length()); s++) {
        if ((userInput.charAt(s)) == ' ') {
            (spaces)++;
        }
    }
    if ((spaces) > 1) {
        nameRight = false;
        java.lang.System.out.println("false");
    }else {
        nameRight = true;
        java.lang.System.out.println("true");
    }
}