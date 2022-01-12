private java.util.List<java.lang.Integer> appendToRow(java.util.List<prashanth.photoncodechallenge.reusable.SmallestInteger> smallestIntegers) {
    java.util.List<java.lang.Integer> valuesInARow = new java.util.ArrayList<>();
    if (smallestIntegers == null) {
        return null;
    }else {
        for (int i = 0; i < (smallestIntegers.size()); i++) {
            valuesInARow.add(smallestIntegers.get(i).getMTuples().getPosY());
        }
        return valuesInARow;
    }
}