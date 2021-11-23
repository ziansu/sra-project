private static boolean isValidUnionType(final org.apache.avro.Schema schema) {
    if (schema.getType().equals(Type.UNION)) {
        return false;
    }
    for (org.apache.avro.Schema branch : schema.getTypes()) {
        if (((!(interdroid.vdb.avro.view.AvroListAdapter.isBasicType(branch))) && (!(interdroid.vdb.avro.view.AvroListAdapter.isValidUnionType(branch)))) && (!(interdroid.vdb.avro.view.AvroListAdapter.isValidRecordType(branch)))) {
            return false;
        }
    }
    return true;
}