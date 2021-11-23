@java.lang.Override
public solidhangman.game.composers.Word getWord() {
    switch (wordMode) {
        case FILE :
            int indexCurrentWord = words.indexOf(currentWord);
            if (indexCurrentWord == ((words.size()) - 1))
                return words.get(0);
            else
                return words.get((indexCurrentWord + 1));
            
        case USER :
            return getWordFromUser();
        default :
            return null;
    }
}