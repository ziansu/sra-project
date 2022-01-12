@java.lang.Override
public void onFailure(int reasonCode) {
    android.widget.Toast.makeText(getActivity(), ("Discovery Failed : " + reasonCode), Toast.LENGTH_SHORT).show();
}