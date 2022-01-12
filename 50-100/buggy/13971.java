static boolean checkWin(char[] characters, char winChar) {
    int count = 0;
    for (char character : characters) {
        if (character == winChar) {
            if ((++count) == 5)
                return true;
            
        }else {
            count = 0;
        }
    }
    return false;
}