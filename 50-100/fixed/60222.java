private void editPODPath() {
    final java.lang.String result = javax.swing.JOptionPane.showInputDialog(this, "Edit POD Path", podLM.get(missionList.getSelectedIndex()));
    if (result == null)
        return ;
    
    if (checkPOD(new java.io.File(result)))
        podLM.set(podList.getSelectedIndex(), result);
    
}