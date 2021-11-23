private io.dojogeek.adminibot.models.TypePaymentMethodModel getPaymentMethodModelFromCursor(android.database.Cursor cursor) {
    io.dojogeek.adminibot.models.TypePaymentMethodModel paymentMethodModel = new io.dojogeek.adminibot.models.TypePaymentMethodModel();
    long id = cursor.getInt(cursor.getColumnIndex(TypesPaymentMethodsContract.TypePaymentMethod._ID));
    int name = cursor.getInt(cursor.getColumnIndex(TypesPaymentMethodsContract.TypePaymentMethod.COLUMN_NAME));
    int description = cursor.getInt(cursor.getColumnIndex(TypesPaymentMethodsContract.TypePaymentMethod.COLUMN_DESCRIPTION));
    paymentMethodModel.id = id;
    paymentMethodModel.name = name;
    paymentMethodModel.description = description;
    return paymentMethodModel;
}