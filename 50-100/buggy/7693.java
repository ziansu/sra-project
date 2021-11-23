public void placeFoodBlobs() {
    int counter = 11;
    while (counter != 0) {
        java.awt.Point[] foodBlob = makeFoodBlob();
        if (foodBlob != null) {
            for (java.awt.Point p : foodBlob) {
                map.getCell(p).setHasFood(5);
            }
            counter--;
        }
    } 
}