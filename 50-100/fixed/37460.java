@java.lang.Override
public org.activityinfo.model.form.FormInstance next() {
    org.activityinfo.model.form.FormInstance record = new org.activityinfo.model.form.FormInstance(id.values.get(row), formId);
    for (org.activityinfo.store.mysql.cursor.RecordCursor.FieldCollector field : fields) {
        record.set(field.fieldId, field.values.get(row));
    }
    (row)++;
    return record;
}