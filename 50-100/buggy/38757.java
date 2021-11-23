private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        checkValues();
        clearImages();
        NewtonCalc.Universe universe = new NewtonCalc.Universe(initVel, g, massBase, massPow, mass, radius);
        displayValues(universe);
        queue.add(universe);
    } catch (java.lang.Exception e) {
    }
}