public static void main(java.lang.String[] args) {
    int bits = 4;
    int[] ids = new int[]{ 6 , 9 };
    int firstId = 3;
    java.util.ArrayList<java.lang.Integer> e = new java.util.ArrayList<>(ids.length);
    for (int id : ids) {
        e.add(id);
    }
    java.util.Collections.sort(e);
    ChordNetwork net = new ChordNetwork(bits, firstId);
    net.addNodes(e);
    java.lang.System.out.println(net);
}