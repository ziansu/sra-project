public java.lang.String validate() {
    if (name.equals("")) {
        return "Fill a criteria.";
    }
    if ((Criteria.find.where().eq("name", name).findRowCount()) > 0) {
        return "Have this criteria in the system.";
    }
    return null;
}