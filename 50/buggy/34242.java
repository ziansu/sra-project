public void setBirthday(java.lang.String birthday) {
    mBirthday = birthday;
    mUpdateProfileRequest.setBirthday(birthday);
    notifyPropertyChanged(BR.birthday);
}