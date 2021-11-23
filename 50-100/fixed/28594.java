public void finalizeStructure() {
    int offset = 0;
    for (com.heatonresearch.aifh.flat.FlatObject obj : this.flatObjects) {
        offset = obj.init(offset);
    }
    this.data = new double[offset];
    for (com.heatonresearch.aifh.flat.FlatObject obj : this.flatObjects) {
        obj.setData(data);
    }
}