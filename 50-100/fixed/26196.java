private void setMean() {
    org.eclipse.january.dataset.IDataset iregionDataset = ((org.eclipse.january.dataset.IDataset) (calibrationData.getList(ARPESCalibrationConstants.REGION_DATANAME)));
    org.eclipse.january.dataset.Dataset regionDataset = org.eclipse.january.dataset.DatasetUtils.cast(iregionDataset, org.eclipse.january.dataset.DTypeUtils.getDType(iregionDataset));
    org.eclipse.january.dataset.Dataset meanDataset = regionDataset.mean(0);
    meanDataset.setName(ARPESCalibrationConstants.MEAN_DATANAME);
    calibrationData.addList(ARPESCalibrationConstants.MEAN_DATANAME, meanDataset);
}