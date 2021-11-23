public void datasetChanged(java.util.List<com.random.recyclerviewbug.MainModel> dataset) {
    android.support.v7.util.DiffUtil.DiffResult diffResult = calculateDiffResult(dataset);
    this.dataset = new java.util.ArrayList(dataset);
    diffResult.dispatchUpdatesTo(this);
}