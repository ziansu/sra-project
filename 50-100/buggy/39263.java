public static java.util.ArrayList<com.tuccro.cars.core.Brand> getBrandsFromDBCursor(android.database.Cursor cursor) {
    java.util.ArrayList<com.tuccro.cars.core.Brand> brands = new java.util.ArrayList<>();
    int id;
    java.lang.String name;
    cursor.moveToFirst();
    while (cursor.moveToNext()) {
        id = cursor.getInt(cursor.getColumnIndex(com.tuccro.cars.utils.BRAND_ID));
        name = cursor.getString(cursor.getColumnIndex(com.tuccro.cars.utils.BRAND_NAME));
        brands.add(new com.tuccro.cars.core.Brand(id, name));
    } 
    return brands;
}