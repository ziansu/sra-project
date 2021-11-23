private void refillLookAheadBuffer(int amount, ouch.Readers.TextReadable text) {
    char[] chars = text.getNextChars(amount);
    if (endReached) {
        return ;
    }
    if (chars == null) {
        if (amount != 0) {
            endReached = true;
            lookAheadBuffer.add(ouch.transcoders.Compressions.FILE_SEPERATOR);
        }
    }else {
        for (char c : chars) {
            lookAheadBuffer.add(c);
        }
    }
    metrics.increaseSizeBefore(amount);
}