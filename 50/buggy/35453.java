public void setWork(sne.workorganizer.db.Project work) {
    _project = work;
    if ((_project) == null) {
        return ;
    }
    fillViews();
}