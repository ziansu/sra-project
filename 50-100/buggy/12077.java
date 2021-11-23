public void onClick(android.view.View v) {
    if ((item.isLost) == true) {
        mDatabase.getReference((("beacon/" + (item.devAddress)) + "/")).child("isLost").setValue(false);
        mDatabase.getReference("lost_items/").child(item.devAddress).removeValue();
        item.isLost = false;
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "잃어버린 물건이 아닙니다!!", Toast.LENGTH_LONG).show();
    }
}