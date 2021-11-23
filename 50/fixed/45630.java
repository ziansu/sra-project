public void copyBar(int startPosition, int endPosition, int newStartPosition) {
    for (int position = startPosition; position <= endPosition; position++) {
        put((newStartPosition++), get(position));
    }
}