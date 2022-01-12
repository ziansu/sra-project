@java.lang.Override
public void dataUpdated(java.lang.Integer i) {
    float maxVolume = java.lang.Math.min(dataManager.getGlobalMaxVolumeValue(), 1000);
    transferFunction.setMaxOrdinates(new java.awt.geom.Point2D.Float(maxVolume, 1.0F));
    float lowestDataPoint = dataManager.getGlobalLowestVolumeValue();
    transferFunction.resetColors();
    transferFunction.setColor(new java.awt.geom.Point2D.Float(((maxVolume / (dataManager.getGlobalMaxVolumeValue())) * lowestDataPoint), 0.001F), transferFunction.getColors().firstEntry().getValue());
}