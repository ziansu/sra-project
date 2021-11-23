private android.content.ContentValues createContentValues(io.dojogeek.adminibot.models.TypePaymentMethodModel paymentMethod) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(TypesPaymentMethodsContract.TypePaymentMethod.COLUMN_NAME, paymentMethod.name);
    contentValues.put(TypesPaymentMethodsContract.TypePaymentMethod.COLUMN_DESCRIPTION, paymentMethod.description);
    return contentValues;
}