@java.lang.Override
public void instrumentUpdated(uk.ac.stfc.isis.ibex.ui.synoptic.editor.model.UpdateTypes updateType) {
    if (updateType == (uk.ac.stfc.isis.ibex.ui.synoptic.editor.model.UpdateTypes.EDIT_COMPONENT)) {
        saveAsBtn.setEnabled((!(synopticViewModel.getHasDuplicatedName())));
        if ((saveBtn) != null) {
            saveBtn.setEnabled((!(synopticViewModel.getHasDuplicatedName())));
        }
    }
}