@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapter, android.view.View v, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, com.kingsley.android.kupsfood.activities.FoodDescriptionActivity.class);
    startActivity(intent);
}