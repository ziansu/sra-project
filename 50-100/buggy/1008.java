@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        updateListView();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("basketJSONStr", basketJSONStr);
        intent.putExtra("basketDateJSONStr", basketDateJSONStr);
        setResult(com.yuqingcheng.luckinstock.RESULT_OK, intent);
        android.widget.Toast.makeText(getApplicationContext(), "Basket information saved.", Toast.LENGTH_SHORT);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT);
    }
}