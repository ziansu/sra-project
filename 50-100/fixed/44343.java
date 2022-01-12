public void setOptStat(int opts) {
    if ((this.getDatasetPlotters().size()) > 0) {
        this.getDatasetPlotters().get(0).getDataSet().getAttributes().setOptStat(opts);
    }
}