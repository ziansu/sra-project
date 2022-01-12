private static char getSymbol(int index) {
    if (index < (ru.spbau.mit.StringSetImpl.START_INDEX)) {
        return ((char) (index + ((int) ('A'))));
    }
    return ((char) ((index - (ru.spbau.mit.StringSetImpl.START_INDEX)) + ((int) ('a'))));
}