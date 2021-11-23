private void execPsmt(java.lang.String sql, java.lang.Object... args) {
    try {
        java.sql.PreparedStatement psmt = c.prepareStatement(sql);
        for (int i = 0; i < (args.length); ++i) {
            psmt.setObject((i + 1), args[i]);
        }
        psmt.execute();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}