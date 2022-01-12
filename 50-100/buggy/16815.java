public void updateNameTextField() {
    if ((project) != null) {
        try {
            android.util.Log.d("ProjectName", ("setting project name: " + (projectNameEditText.getText().toString())));
            project.setProjectName(projectNameEditText.getText().toString());
        } catch (bert.data.proj.exceptions.InvalidProjectNameException e) {
        }
        projectNameEditText.setText(project.getProjectName());
        projectID = project.getProjectName();
        activity.projectListAdapter.titles.set(listCellIndex, project.getProjectName());
    }
}