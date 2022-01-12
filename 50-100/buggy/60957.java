private void initializeRivers(java.util.List<java.lang.Integer> tempRivers) {
    if (!(tempRivers.isEmpty())) {
        rivers = new int[tempRivers.size()];
        for (int i = 0; i < (tempRivers.size()); i++) {
            rivers[i] = tempRivers.get(i);
        }
    }
}