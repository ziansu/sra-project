public void calcEndDate() {
    if (((versions) != null) && (!(versions.isEmpty()))) {
        endDate = versions.get(((versions.size()) - 1)).getEndDate();
    }else {
        endDate = new classes.Date();
    }
}