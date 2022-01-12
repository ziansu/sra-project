public static java.util.List<Dimension> getHorizontalDimensions(Dimension dime) {
    java.util.List<Dimension> boxDimes = new java.util.ArrayList<Dimension>();
    for (int y = 0; y < 9; y++) {
        if (y != (dime.y)) {
            Dimension dimeCurrent = new Dimension(dime.x, y);
            boxDimes.add(dimeCurrent);
        }
    }
    return boxDimes;
}