public void setServerInfo() {
    if (((mPreferences.getCustomServer()) != null) && (!(mPreferences.getCustomServer().isEmpty()))) {
        getJay().setNode(mPreferences.getCustomServer());
        getJay().setRequestMethod(RequestMethods.Single);
    }else {
        getJay().setRequestMethod(RequestMethods.Fastest);
    }
    getJay().setIsTestnet(mPreferences.getIsTestNet());
}