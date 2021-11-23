private void updateResults() {
    int lastIndex;
    if (isLoading) {
        lastIndex = results.size();
    }else {
        lastIndex = (results.size()) - 1;
    }
    fireContentsChanged(this, oldLength, oldLength);
    fireIntervalAdded(this, oldLength, lastIndex);
    oldLength = results.size();
}