private boolean checkSelectedGrades(java.lang.String[] stringArray, java.lang.String selectedValue) {
    java.lang.String grades = org.ednovo.gooru.client.gin.AppClientFactory.getPlaceManager().getRequestParameter(org.ednovo.gooru.client.mvp.gsearch.util.GooruGradesView.GRADE_FLT);
    if (grades != null) {
        grades += selectedValue;
        for (int i = 1; i < (stringArray.length); i++) {
            if (!(grades.contains(stringArray[i]))) {
                return false;
            }
        }
    }
    return true;
}