public void setServerInfo() {
    if (((mPreferences.getCustomServer()) == null) || (mPreferences.getCustomServer().isEmpty())) {
        mJay.setRequestMethod(RequestMethods.Fastest);
        mJay.setIsTestnet(false);
    }else {
        mJay.setNode(mPreferences.getCustomServer());
        mJay.setRequestMethod(RequestMethods.Single);
        mJay.setIsTestnet(mPreferences.getIsTestNet());
    }
}