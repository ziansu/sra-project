public void validateNewPassword(java.lang.String newPassWord) {
    mPresenter.validateNewPasswordInput(newPassWord);
    mNewPassword = newPassWord;
    notifyPropertyChanged(BR.newPassword);
}