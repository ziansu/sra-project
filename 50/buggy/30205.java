ru.spbau.mit.StringSetImpl.StringSetEntry getNextEntry(char letter) {
    return next.get(getIndex(letter));
}