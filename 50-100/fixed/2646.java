private void addSpeeds() {
    java.lang.String maxSpeed = java.lang.String.format(java.util.Locale.getDefault(), "%.1f %s", ((pastRunItem.maxSpeed) * (speedUnits.multiplier)), speedUnits.label);
    java.lang.String avgSpeed = java.lang.String.format(java.util.Locale.getDefault(), "%.1f %s", ((pastRunItem.avgSpeed) * (speedUnits.multiplier)), speedUnits.label);
    runStatItems.add(new letshangllc.letsride.helpers.RunStatItem(R.drawable.ic_speedometer, "Max. Speed", maxSpeed));
    runStatItems.add(new letshangllc.letsride.helpers.RunStatItem(R.drawable.ic_speedometer, "Avg. Speed", avgSpeed));
}