private void editVOXPath() {
    final java.lang.String result = javax.swing.JOptionPane.showInputDialog(this, "Edit VOX Path", missionLM.get(missionList.getSelectedIndex()));
    if (result == null)
        return ;
    
    if (checkVOX(new java.io.File(result)))
        missionLM.set(missionList.getSelectedIndex(), result);
    
}