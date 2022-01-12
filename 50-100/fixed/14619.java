private java.util.List<java.lang.Integer> initializeShopsToVisit(int shopNumber) {
    shopsToVisit = new java.util.ArrayList<>();
    int numberShopsToVisit = Environment.RandomGenerator.getInstance().uniformInt(1, shopNumber);
    numberShopsToVisit = 1;
    for (int i = 0; i < numberShopsToVisit; i++) {
        int shopToVisit = Environment.RandomGenerator.getInstance().uniformInt(0, shopNumber);
        if (!(shopsToVisit.contains(shopToVisit)))
            shopsToVisit.add(shopToVisit);
        
    }
    return shopsToVisit;
}