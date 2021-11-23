private com.google.hashcode.List<com.google.hashcode.integer> fillAllDifferenceY(com.google.hashcode.List<com.google.hashcode.Cell> slice) {
    com.google.hashcode.List<java.lang.Integer> diffY = new com.google.hashcode.ArrayList<java.lang.Integer>();
    for (com.google.hashcode.Cell cell : slice) {
        if (!(diffX.contains(cell.y))) {
            diffX.add(cell.y);
        }
    }
    return diffY;
}