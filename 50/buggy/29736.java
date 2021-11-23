private void updateSpeedLabel() {
    java.lang.String speedLabelText = "Sim Speed: " + (simSpeeds[speedIndex]);
    java.lang.System.out.println(("Sim speed changed to " + (java.lang.String.format("%.1f", simSpeeds[speedIndex]))));
    simSpeedLabel.setText(speedLabelText);
}