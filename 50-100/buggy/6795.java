@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.util.Random rand = new java.util.Random();
    vehicleTypePrivacyField.setValue(rand.nextDouble());
    emergencyTypePrivacyField.setValue(rand.nextDouble());
    malfunctionTypePrivacyField.setValue(rand.nextFloat());
    numOfPeoplePrivacyField.setValue(rand.nextFloat());
    thresholdPrivacyField.setValue(rand.nextDouble());
}