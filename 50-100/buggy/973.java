public void setServerInfo() {
    if (((mPreferences.getCustomServer()) != null) && ((mPreferences.getCustomServer()) != "")) {
        mJay.setNode(mPreferences.getCustomServer());
        mJay.setRequestMethod(RequestMethods.Single);
        mJay.setIsTestnet(mPreferences.getIsTestNet());
    }else {
        mJay.setRequestMethod(RequestMethods.Fastest);
        mJay.setIsTestnet(false);
    }
}