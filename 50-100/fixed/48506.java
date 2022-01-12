private void updateKnownWord() {
    int replaceLocation = 0;
    while (replaceLocation < (secretWord.length())) {
        replaceLocation = secretWord.indexOf(guess, replaceLocation);
        if (replaceLocation == (-1)) {
            break;
        }
        replaceLocation = updateKnownWord(replaceLocation);
    } 
}