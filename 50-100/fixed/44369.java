private void setCurrentGroup() {
    if (((mUser.getGroups()) == null) || ((mUser.getGroups().size()) == 0)) {
        return ;
    }
    com.framgia.wsm.data.model.Group group = mUser.getGroups().get(mCurrentGroupPosition);
    mRequestOff.setGroupId(group.getGroupId());
    mRequestOff.setGroup(mUser.getGroups().get(mCurrentGroupPosition));
    notifyPropertyChanged(BR.requestOff);
}