private io.dojogeek.adminibot.models.TypePaymentMethodModel getPaymentMethodModelFromCursor(android.database.Cursor cursor) {
    io.dojogeek.adminibot.models.TypePaymentMethodModel paymentMethodModel = new io.dojogeek.adminibot.models.TypePaymentMethodModel();
    long id = cursor.getInt(cursor.getColumnIndex(TypesPaymentMethodsContract.TypePaymentMethod._ID));
    java.lang.String name = cursor.getString(cursor.getColumnIndex(TypesPaymentMethodsContract.TypePaymentMethod.COLUMN_NAME));
    java.lang.String description = cursor.getString(cursor.getColumnIndex(TypesPaymentMethodsContract.TypePaymentMethod.COLUMN_DESCRIPTION));
    return paymentMethodModel;
}