public void info(java.lang.String sql) {
    if (sql.endsWith(";"))
        sb.append(("\r\n" + sql));
    else
        sb.append((("\r\n" + sql) + ";"));
    
}