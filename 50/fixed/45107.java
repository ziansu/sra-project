private void updateEstimatedKmLeft(double fuelConsumed) {
    estimatedKmLeft = ((tankSize) - fuelConsumed) / (fuelUsage);
    updateEstimatedKmLeftText();
}