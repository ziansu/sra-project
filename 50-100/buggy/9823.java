protected void fillValues(java.util.List<java.lang.Object> valueList, java.lang.String sql, java.sql.PreparedStatement stmt) {
    int index = 1;
    for (java.lang.Object o : valueList) {
        try {
            stmt.setObject((index++), o);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException((((((((e.getMessage()) + " - Index: ") + index) + ", Value: ") + o) + ", Query: ") + sql), e);
        }
    }
}