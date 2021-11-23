@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int arg2, long arg3) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.example.juan.eduquer.Webview.class);
    intent.putExtra("link", result.getItems().get(arg2).getLink());
    startActivityForResult(intent, 1);
}