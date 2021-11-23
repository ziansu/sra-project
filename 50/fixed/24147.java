public void projectImageClick(@org.jetbrains.annotations.NotNull
java.lang.String id) {
    myDB.setProjectStatus(id, Status.DEFAULT);
    myDB.setFavouriteProject(id, (!(myDB.isProjectFavourite(id))));
}