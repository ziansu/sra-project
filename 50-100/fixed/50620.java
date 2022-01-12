public void setBarValue(int barIndex, int value) {
    if ((value < 0) || (value > 100)) {
        throw new java.lang.IllegalArgumentException(("Bar value must be in [0,100]. Input: " + value));
    }
    try {
        barValues[barIndex] = value;
        setChanged();
        notifyObservers();
    } catch (java.lang.IndexOutOfBoundsException e) {
        throw new java.lang.IllegalArgumentException(("Index must be in [0,2]. Input: " + barIndex));
    }
}