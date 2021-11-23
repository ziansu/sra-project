public void setMyProfileModel(com.chatapp.service.models.response.MyProfileModel myProfileModel) {
    this.myProfile = myProfileModel;
    if (!(mDataset.contains(myProfile))) {
        mDataset.add(0, myProfileModel);
    }
    notifyDataSetChanged();
}