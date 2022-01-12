public void nextShooterButtonPressed(android.view.View view) {
    saveData();
    incrementShooterIndex();
    shooterName.setText(shooters[shooterIndex].getName());
    hitCounter.setText(java.lang.Integer.toString(shooters[shooterIndex].getHits()[stations.getStationNumber()]));
    setShooterTotal();
}