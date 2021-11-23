@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    switch (msg.what) {
        case 1 :
            whiteListAdapter = new com.josie.earthquake.adapter.WhiteListAdapter(this, result, getLayoutInflater(), getFragmentManager());
            listView.setAdapter(whiteListAdapter);
            break;
    }
}