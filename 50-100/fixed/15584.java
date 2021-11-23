@butterknife.OnClick(value = { R.id.projectInfoActivity_editProjectButton , R.id.projectInfoActivity_saveProjectButton })
public void onUserSelectAButton(android.view.View view) {
    switch (view.getId()) {
        case R.id.projectInfoActivity_editProjectButton :
            tobedevelopers.project_fury.ToastLog.makeDebug(this, "Edit Project", Toast.LENGTH_SHORT);
            presenter.userSelectEditProject();
            break;
        case R.id.projectInfoActivity_saveProjectButton :
            tobedevelopers.project_fury.ToastLog.makeDebug(this, "Save Project", Toast.LENGTH_SHORT);
            presenter.userSelectSaveProject();
            break;
        default :
            tobedevelopers.project_fury.ToastLog.makeError(this, java.lang.String.format(getString(R.string.error_message), getTitle()), Toast.LENGTH_SHORT);
            break;
    }
}