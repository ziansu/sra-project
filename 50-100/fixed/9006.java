public static void main(java.lang.String[] args) {
    int bits = 3;
    int[] ids = new int[]{ 3 , 6 , 1 };
    int firstId = 0;
    java.util.ArrayList<java.lang.Integer> e = new java.util.ArrayList<>(ids.length);
    for (int id : ids) {
        e.add(id);
    }
    ChordNetwork net = new ChordNetwork(bits, firstId);
    net.addNodes(e);
    java.lang.System.out.println(net);
}