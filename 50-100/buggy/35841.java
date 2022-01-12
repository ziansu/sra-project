public void loadGroups() {
    checkViewAttached();
    java.util.List<ru.ulstu_team.ulstuschedule.data.model.Group> groups = getRealmQuery().findAll();
    if ((groups.size()) > 50) {
        getMvpView().showGroups(groups);
    }else {
        mDataManager.executeRequest(getRequest());
    }
}