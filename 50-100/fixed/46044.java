@java.lang.Override
public void onNetworkStateChaged(boolean networkConnected, android.net.NetworkInfo currentNetwok, android.net.NetworkInfo lastNetwork) {
    if (networkConnected) {
        mTvMsg.setText(("网络已连接" + (null == currentNetwok ? "" : currentNetwok.toString())));
    }else {
        mTvMsg.setText("网络已连接已断开");
    }
}