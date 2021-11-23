@java.lang.Override
public void setRawData(java.util.List<float[]> data) {
    this.centroids = null;
    this.data = new edu.uc.rphash.tests.clusterers.KMeans2.PointND[data.size()];
    for (int i = 0; i < (data.size()); i++) {
        this.data[i] = new edu.uc.rphash.tests.clusterers.KMeans2.PointND(data.get(i), 1, new float[data.get(0).length]);
    }
}