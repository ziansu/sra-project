public void update(java.util.Observable observable, java.lang.Object arg) {
    if (observable == (getProjectModel())) {
        if (((getCurrentProjectName()) == null) || (!(getCurrentProjectName().equals(getProjectModel().getProjectName())))) {
            setCurrentProjectName(getProjectModel().getProjectName());
            if (defaultCheckButtonSelected) {
                updateDefaultProjectLocation();
            }
        }
    }
}