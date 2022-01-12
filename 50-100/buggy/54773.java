public void removeLinearList(java.lang.Integer[] array) {
    if (thereIsLinearList(array)) {
        for (int i = startList; i < (endList); i++) {
            array[i] = 1;
        }
    }else {
        java.lang.System.out.println("Não há lista linear.");
    }
}