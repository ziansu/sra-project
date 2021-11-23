protected boolean checkInternetConnectivity() {
    if (!(com.thetidbitapp.util.InternetUtil.isOnline(mContext))) {
        return false;
    }
    return true;
}