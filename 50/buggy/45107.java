private void updateEstimatedKmLeft(double fuelConsumed) {
    estimatedKmLeft = ((tankSize) - fuelConsumed) / (fuelUsage);
    java.lang.System.out.println(("estimatedLeft: " + (estimatedKmLeft)));
    updateEstimatedKmLeftText();
}