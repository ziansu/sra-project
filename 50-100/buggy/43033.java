public void editSubject(final com.jeremy.schooltool.Subject subject) {
    fromMarkAdding = false;
    superClassManager.setSubjectUpdateId(listIds.get(subject.getSubjectId()));
    isSubjectUpdate = true;
    subjectAddingDialog = superClassManager.createSubjectAddingDialog();
    superClassManager.fillSubjectDialog(subjectAddingDialog, subject.getSubjectName(), subject.getSubjectShortening(), subject.getSubjectRelevance());
    ((android.widget.TextView) (subjectAddingDialog.findViewById(R.id.alertBox_subjectEntry_title))).setText(getString(R.string.action_updateSubject));
}