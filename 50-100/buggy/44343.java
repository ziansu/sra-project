public void setOptStat(int opts) {
    this.optStat = opts;
    if ((this.getDatasetPlotters().size()) > 0) {
        this.getDatasetPlotters().get(0).getDataSet().getAttributes().setOptStat(opts);
    }
}