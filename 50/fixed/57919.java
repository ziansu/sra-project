@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.unibo.koci.moneytracking.Activities.EditActivity.class);
    intent.putExtra("item", item);
    startActivity(intent);
}