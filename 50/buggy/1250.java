public java.lang.String getTeamPhotoPath(int teamNumber) {
    java.lang.String photoName = ((teamNumber + "_") + (new java.util.Date().getTime())) + ".jpg";
    return ((ca.team2706.scouting.mcmergemanager.FileUtils.mLocalTeamPhotosFilePath) + "/") + photoName;
}