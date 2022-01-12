public static java.util.List<Dimension> getVerticalDimensions(Dimension dime) {
    java.util.List<Dimension> boxDimes = new java.util.ArrayList<Dimension>();
    for (int x = 0; x < 9; x++) {
        if (x != (dime.x)) {
            Dimension dimeCurrent = new Dimension();
            dimeCurrent.x = x;
            dimeCurrent.y = dime.y;
            boxDimes.add(dimeCurrent);
        }
    }
    return boxDimes;
}