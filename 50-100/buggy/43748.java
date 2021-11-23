public boolean isName(java.lang.String userInput) {
    for (int s = 0; s < (userInput.length()); s++) {
        if ((userInput.charAt(s)) == ' ') {
            (spaces)++;
        }
    }
    if ((spaces) >= 2) {
        nameRight = false;
        java.lang.System.out.println("false");
    }else {
        nameRight = true;
        java.lang.System.out.println("true");
    }
    return nameRight;
}