public void onDatabaseResynced() {
    mDatabaseProgressDialog.dismiss();
    wycliffeassociates.recordingapp.ProjectManager.ProjectDatabaseHelper db = new wycliffeassociates.recordingapp.ProjectManager.ProjectDatabaseHelper(this);
    mNumProjects = db.getNumProjects();
    mDbResyncing = false;
    initializeViews();
}