private java.util.ArrayList<Gate> doMiddle() {
    java.util.ArrayList<Gate> middle = new java.util.ArrayList<Gate>(k);
    for (int x = 0; x < (k); x++) {
        middle.add(new Gate(x));
    }
    return middle;
}