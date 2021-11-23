@java.lang.Override
public void map(java.util.TreeMap<java.lang.Double, java.lang.Double[]> data) {
    for (java.lang.Double frecuency : data.keySet()) {
        java.lang.Double[] vectors = data.get(frecuency);
        if (vectors != null) {
            int i = 0;
            java.lang.Double old = java.lang.Double.MIN_VALUE;
            for (java.lang.Double vector : vectors) {
                if (vector > old) {
                    this.maxVectorCol = i;
                    old = vector;
                }
                i++;
            }
        }
        this.data.put(frecuency, vectors);
    }
}