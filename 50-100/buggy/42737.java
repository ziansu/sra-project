@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int position, long arg3) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("school", schoolsAlllList.get(position).getUnivsNameString());
    setResult(com.android.biubiu.activity.mine.RESULT_OK, intent);
    finish();
    toastShort(("" + (schoolsAlllList.get(position).getUnivsNameString())));
}