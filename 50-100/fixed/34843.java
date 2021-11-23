private java.lang.String getKeyIsNullPredicate(gobblin.compaction.HiveTable table) {
    boolean addAnd = false;
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.String keyAttribute : table.getPrimaryKeys()) {
        if (addAnd) {
            sb.append(" AND ");
        }
        sb.append(((((table.getNameWithJobId(this.jobId)) + ".") + keyAttribute) + " IS NULL"));
        addAnd = true;
    }
    return sb.toString();
}