public void isName(java.lang.String userInput) {
    spaces = 0;
    for (int s = 0; s < (userInput.length()); s++) {
        if ((userInput.charAt(s)) == ' ') {
            (spaces)++;
        }
    }
    if ((spaces) != 0) {
        nameRight = false;
    }else {
        nameRight = true;
    }
}