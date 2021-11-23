@java.lang.Override
public void onClick(android.view.View v) {
    mIntent.putExtra("station", "0");
    StationIntent.putExtra("ID", SelectedID);
    finish();
    startActivity(mIntent);
}