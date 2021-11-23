public void subtract(int subtractable) {
    if (subtractable >= 0) {
        stat -= subtractable;
        modelNotifyObservers();
    }
}