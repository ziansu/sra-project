void Autonomous() {
    heavensWrit = commandChooser.getSelected();
    if ((heavensWrit) != null) {
        heavensWrit.start();
    }
}