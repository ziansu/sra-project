protected void onPostExecute(com.github.mikephil.charting.data.LineData data) {
    if ((mData.getDataSetCount()) != 0) {
        mGraph.setData(data);
        mGraph.invalidate();
    }
    mGraph.setNoDataText(getString(R.string.graphs_noData));
}