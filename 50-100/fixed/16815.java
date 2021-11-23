public void updateNameTextField() {
    if ((project) != null) {
        try {
            android.util.Log.d("ProjectName", ("setting project name: " + (projectNameEditText.getText().toString())));
            project.setProjectName(projectNameEditText.getText().toString());
        } catch (bert.data.proj.exceptions.InvalidProjectNameException e) {
        }
        projectID = project.getProjectName();
        projectNameEditText.setText(project.getProjectName());
        activity.projectListAdapter.titles.set(listCellIndex, project.getProjectName());
    }
}