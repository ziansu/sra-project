public void readPropertiesFromContentValues(android.content.ContentValues values, com.yahoo.squidb.sql.Property<?>... properties) {
    prepareToReadProperties();
    if (values != null) {
        for (com.yahoo.squidb.sql.Property<?> property : properties) {
            if (values.containsKey(property.getName())) {
                com.yahoo.squidb.utility.SquidUtilities.putInto(this.values, property.getName(), getFromValues(property, values), true);
            }
        }
    }
}