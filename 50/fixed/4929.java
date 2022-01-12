public void loadSeries() {
    fragmentSeriesBinding.setViewmodel(this);
    notifyPropertyChanged(BR.viewmodel);
    setHeader();
}