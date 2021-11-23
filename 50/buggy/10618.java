private void jButtonSquareRootActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String value = mathProc.Sqrt(numStorage.GetNumber());
    numStorage.SetDisplay(value);
    UpdateDisplay();
}