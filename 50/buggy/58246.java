protected void getSipNumber() {
    conn.invoke("getSipNumber", new java.lang.Object[]{ java.lang.Integer.valueOf(roomId).longValue() }, this);
}