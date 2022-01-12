public void onClick(android.view.View v) {
    mDatabase.getReference((("beacon/" + (item.devAddress)) + "/")).child("isLost").setValue(false);
    mDatabase.getReference("lost_items/").child(item.devAddress).removeValue();
    item.isLost = false;
}