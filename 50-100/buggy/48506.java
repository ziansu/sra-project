private void updateKnownWord() {
    println(("\n the word is " + (secretWord)));
    int replaceLocation = 0;
    while (replaceLocation < (secretWord.length())) {
        println(("i = " + replaceLocation));
        println(("current KnownWord " + (knownWord)));
        replaceLocation = secretWord.indexOf(guess, replaceLocation);
        if (replaceLocation == (-1)) {
            break;
        }
        replaceLocation = updateKnownWord(replaceLocation);
    } 
}