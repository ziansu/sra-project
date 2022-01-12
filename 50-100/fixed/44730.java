public static org.odk.collect.android.logic.FormRelationsManager getFormRelationsManager(org.javarosa.core.model.instance.TreeElement instanceRoot) {
    org.odk.collect.android.logic.FormRelationsManager frm = new org.odk.collect.android.logic.FormRelationsManager();
    try {
        org.odk.collect.android.logic.FormRelationsManager.traverseInstance(instanceRoot, frm, null);
    } catch (org.odk.collect.android.exception.FormRelationsException e) {
        if (org.odk.collect.android.logic.FormRelationsManager.DELETE_FORM.equals(e.getMessage())) {
            if (org.odk.collect.android.logic.FormRelationsManager.LOCAL_LOG) {
                android.util.Log.d(org.odk.collect.android.logic.FormRelationsManager.TAG, "Interrupt traverse to delete instance");
            }
            frm.setDeleteForm(true);
        }
    }
    return frm;
}