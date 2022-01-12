public java.util.List<java.lang.Object> random(java.util.List<java.lang.Object> tempItemsList) {
    java.util.List<java.lang.Object> newItemsList = new java.util.ArrayList<>();
    java.util.Random random = new java.util.Random();
    for (int i = 0; i < (tempItemsList.size()); i++) {
        int randomValue = random.nextInt(tempItemsList.size());
        newItemsList.add(tempItemsList.get(randomValue));
    }
    return newItemsList;
}