public void pickedStoreClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), dgd.payaway.CartActivity.class);
    if (null == (pickedStore)) {
        android.widget.Toast.makeText(this, "Wait for stores to load!", Toast.LENGTH_LONG).show();
        return ;
    }
    intent.putExtra("pickedStore", pickedStore);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(intent);
}