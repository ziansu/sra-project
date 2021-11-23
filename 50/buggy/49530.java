@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.android.starwarsv2.ListActivity.class);
    intent.putExtra("ListViewType", com.example.android.starwarsv2.MainActivity.PEOPLE);
    startActivity(intent);
    finish();
}