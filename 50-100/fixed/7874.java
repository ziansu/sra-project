@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int itemClicked = item.getItemId();
    if (itemClicked == (R.id.item_Setting)) {
        android.content.Context context = this;
        android.content.Intent activity_setting = new android.content.Intent(context, com.example.william.earthdayapplication.SettingActivity.class);
        startActivity(activity_setting);
    }
    if (itemClicked == (R.id.item_Instruction)) {
    }
    if (itemClicked == (R.id.item_Help)) {
        android.content.Intent toy = new android.content.Intent(getApplicationContext(), com.example.william.earthdayapplication.Main2Activity.class);
        startActivity(toy);
    }
    return super.onOptionsItemSelected(item);
}