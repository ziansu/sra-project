public boolean addElement(jonasandtim.energietagebuch.Data.DataElements.XDataElement element) {
    if ((mStats) == null) {
        if (element instanceof jonasandtim.energietagebuch.Data.DataElements.XVehicleDataElement) {
            mStats = new jonasandtim.energietagebuch.Data.Calculations.VehicleTreeStats();
        }else {
            mStats = new jonasandtim.energietagebuch.Data.Calculations.MeterTreeStats();
        }
    }
    mStatsCardUpToDate = false;
    if (!(_allData.contains(element))) {
        _allData.add(element);
    }
    return true;
}