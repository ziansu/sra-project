public void subtract(int subtractable) {
    stat -= subtractable;
    modelNotifyObservers();
}