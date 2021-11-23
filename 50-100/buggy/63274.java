@java.lang.Override
public org.apache.spark.sql.types.DataType getSchemaType() {
    org.apache.spark.sql.types.StructField[] fields = new org.apache.spark.sql.types.StructField[children.size()];
    for (int i = 0; i < (children.size()); i++) {
        fields[i] = new org.apache.spark.sql.types.StructField(children.get(i).getName(), children.get(i).getSchemaType(), true, org.apache.spark.sql.types.Metadata.empty());
    }
    return new org.apache.spark.sql.types.StructType(fields);
}