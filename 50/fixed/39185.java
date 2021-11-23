void Autonomous() {
    while (true) {
        heavensWrit = commandChooser.getSelected();
        if ((heavensWrit) != null) {
            heavensWrit.start();
        }
    } 
}