@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.widget.Toast.makeText(getActivity(), "브로드캐스트", Toast.LENGTH_SHORT).show();
    doClear = true;
    startKey = 0;
    getData();
}