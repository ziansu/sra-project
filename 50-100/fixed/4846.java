@java.lang.Override
public void refresh() {
    if ((realManager.getToken()) == null) {
        showLoadingEnded();
        if (!(de.tum.in.tumcampus.auxiliary.NetUtils.isConnected(this)))
            showNoInternetLayout();
        else
            de.tum.in.tumcampus.auxiliary.Utils.showToast(this, R.string.login_failed);
        
    }else {
        if ((intent) != null) {
            startActivity(intent);
            de.tum.in.tumcampus.auxiliary.Utils.log("got the token now starting the previous activity");
        }
    }
}