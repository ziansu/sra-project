public com.odoo.core.orm.OValues getControlValues() {
    com.odoo.core.orm.OValues values = getValues(false);
    if ((mRecord) != null) {
        for (java.lang.String key : values.keys()) {
            if ((values.get(key).toString().equals("false")) && (!(mRecord.get(key).toString().equals("false")))) {
                values.put(key, mRecord.get(key));
            }
        }
    }
    return values;
}