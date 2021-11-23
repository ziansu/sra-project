public void setCreateTime(java.sql.Timestamp createTime) {
    if ((this.create_at) == null) {
        this.create_at = createTime;
    }else {
        throw new java.lang.IllegalStateException();
    }
}