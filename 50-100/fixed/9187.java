ru.spbau.mit.StringSetImpl.StringSetEntry removeEntry(char letter, boolean notLastLetter) {
    (numberOfSuccessors)--;
    int idx = getIndex(letter);
    ru.spbau.mit.StringSetImpl.StringSetEntry nextEntry = next.get(idx);
    if (((nextEntry.numberOfSuccessors) == 1) && notLastLetter) {
        next.set(idx, null);
    }
    return nextEntry;
}