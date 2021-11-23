private demo.kolorob.kolorobdemoversion.model.FInancial.FinancialServiceDetailsItem cursorToSubCatList(android.database.Cursor cursor) {
    java.lang.String _finId = cursor.getString(0);
    java.lang.String _servicecost = cursor.getString(1);
    java.lang.String _serviceremark = cursor.getString(2);
    java.lang.String _servicetype = cursor.getString(3);
    java.lang.String _servicesubtype = cursor.getString(4);
    return new demo.kolorob.kolorobdemoversion.model.FInancial.FinancialServiceDetailsItem(_finId, _servicecost, _serviceremark, _servicetype, _servicesubtype);
}