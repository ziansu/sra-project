private void refillLookAheadBuffer(int amount, ouch.Readers.TextReadable text) {
    char[] chars = text.getNextChars(amount);
    int i = 0;
    if (endReached) {
        return ;
    }
    if (chars == null) {
        if (amount != 0) {
            endReached = true;
            lookAheadBuffer.add(ouch.transcoders.Compressions.FILE_SEPERATOR);
            i++;
        }
    }else {
        for (char c : chars) {
            lookAheadBuffer.add(c);
            i++;
        }
    }
    metrics.increaseSizeBefore(i);
}