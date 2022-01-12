@java.lang.Override
public solidhangman.game.composers.Word getWord() {
    switch (wordMode) {
        case FILE :
            int indexCurrentWord = words.indexOf(currentWord);
            if (indexCurrentWord == ((words.size()) - 1))
                currentWord = words.get(0);
            else
                currentWord = words.get((indexCurrentWord + 1));
            
            return currentWord;
        case USER :
            return getWordFromUser();
        default :
            return null;
    }
}