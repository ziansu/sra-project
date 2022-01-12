static boolean checkWin(char[] characters, char winChar) {
    int count = 0;
    for (int i = 0; i < (characters.length); i++) {
        if ((characters[i]) == winChar) {
            if ((++count) == 5)
                return true;
            
        }else {
            count = 0;
        }
    }
    return false;
}