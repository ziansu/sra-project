@java.lang.Override
public org.apache.torque.criteria.Criteria build() {
    org.apache.torque.criteria.Criteria root = new org.apache.torque.criteria.Criteria();
    for (java.lang.String key : keys) {
        root = root.or(new org.apache.torque.criteria.Criterion(new org.apache.torque.ColumnImpl(this.tableName, org.apache.eagle.storage.jdbc.JdbcConstants.ROW_KEY_COLUMN_NAME), key, org.apache.torque.criteria.SqlEnum.EQUAL));
    }
    return root;
}