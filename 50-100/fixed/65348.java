public static void main(java.lang.String[] args) {
    de.hhn.aib.digitdemens.utility.Setup.setProperties();
    de.hhn.aib.digitdemens.DigitDemens.dDView = new de.hhn.aib.digitdemens.view.DigitDemensView();
    de.hhn.aib.digitdemens.DigitDemens.dDView.setSize(de.hhn.aib.digitdemens.utility.Variables.getWindowWidth(), de.hhn.aib.digitdemens.utility.Variables.getWindowHeight());
    de.hhn.aib.digitdemens.DigitDemens.dDView.setVisible(true);
    de.hhn.aib.digitdemens.DigitDemens.dDView.setLocationRelativeTo(null);
}