public int getAnomalyValueCount() {
    org.bham.aucom.data.timeseries.TimeSeries<org.bham.aucom.data.Classification> list = getTimeSeries();
    int numberFaults = 0;
    for (int i = 0; i < (list.size()); i++) {
        org.bham.aucom.data.Classification s = list.get(i);
        numberFaults += s.getStatusAsDouble();
    }
    return numberFaults;
}