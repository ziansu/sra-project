@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.util.Random rand = new java.util.Random();
    vehicleTypePrivacyField.setValue(rand.nextDouble());
    emergencyTypePrivacyField.setValue(rand.nextDouble());
    malfunctionTypePrivacyField.setValue(rand.nextDouble());
    numOfPeoplePrivacyField.setValue(rand.nextDouble());
    thresholdPrivacyField.setValue(rand.nextDouble());
}