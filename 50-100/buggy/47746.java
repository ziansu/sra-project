public void wearToday() {
    this.lastWorn = new java.util.Date();
    android.content.ContentValues newValues = new android.content.ContentValues();
    newValues.put(ShirtsHelper.DATE, this.lastWorn.getSeconds());
    com.ddsnowboard.tShirtPicker.Shirt.db.update(ShirtsHelper.DATABASE_NAME, newValues, "_id=?", new java.lang.String[]{ java.lang.String.valueOf(this.id) });
}