@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    hu.gehorvath.lampsv.core.Preset selectedPres = jlUsedPresets.getSelectedValue();
    int currentIndex = usedListModel.indexOf(selectedPres);
    if (currentIndex < (usedListModel.size())) {
        usedListModel.removeElement(selectedPres);
        usedListModel.add((currentIndex + 1), selectedPres);
    }
}