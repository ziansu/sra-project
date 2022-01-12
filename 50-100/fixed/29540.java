public void grow() {
    java.lang.Object[] hold = new java.lang.Object[(circle.length) * 2];
    for (int i = start; i < (end); i++) {
        hold[(i - (start))] = circle[i];
    }
    circle = hold;
}