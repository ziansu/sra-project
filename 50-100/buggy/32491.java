@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case org.wycliffeassociates.translationrecorder.MainMenu.PROJECT_WIZARD_REQUEST :
            {
                if (resultCode == (RESULT_OK)) {
                    org.wycliffeassociates.translationrecorder.ProjectManager.Project project = data.getParcelableExtra(Project.PROJECT_EXTRA);
                    addProjectToDatabase(project);
                    loadProject(project);
                    android.content.Intent intent = org.wycliffeassociates.translationrecorder.Recording.RecordingScreen.getNewRecordingIntent(this, project, 1, 1);
                    startActivity(intent);
                }else {
                    onResume();
                }
            }
        default :
    }
}