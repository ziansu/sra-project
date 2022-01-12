@java.lang.Override
public void onButtonClickListner(int position) {
    try {
        if (isNetworkAvailable()) {
            nextCall(position);
            lvMain.removeHeaderView(lvHeader);
        }else {
            android.widget.Toast.makeText(this, this.getString(R.string.internet_connection_is_not), Toast.LENGTH_SHORT).show();
            lvMain.removeHeaderView(lvHeader);
            lvMain.addHeaderView(lvHeader);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}