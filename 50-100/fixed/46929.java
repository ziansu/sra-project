private void addXtoZ(int x, int z) {
    java.util.ArrayList<java.lang.Integer> temp;
    if ((mapZ.get(z)) == null) {
        temp = new java.util.ArrayList<java.lang.Integer>();
        temp.add(x);
        mapZ.put(z, temp);
    }else {
        mapZ.get(z).add(x);
    }
}