@java.lang.Override
protected void save() {
    if (!(edit))
        return ;
    
    flagDataChanged(false);
    if (((mForm) != null) && (isAdded())) {
        mForm.getEnrollment().setFromServer(false);
        mForm.getEnrollment().save();
    }
    edit = false;
}