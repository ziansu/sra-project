@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, io.moffat.kitchenpal.AddItem.class);
    startActivity(intent);
}