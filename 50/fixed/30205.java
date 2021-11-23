ru.spbau.mit.StringSetImpl.StringSetEntry getNextEntry(char letter) {
    return next.get(ru.spbau.mit.StringSetImpl.StringSetEntry.getIndex(letter));
}