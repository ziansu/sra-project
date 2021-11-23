public static com.yeamy.sql.statement.Clause andAll(java.util.List<com.yeamy.sql.statement.Clause> list) {
    switch (list.size()) {
        case 0 :
            return null;
        case 1 :
            return list.get(0);
        default :
            boolean f = true;
            com.yeamy.sql.statement.MultiClause clause = null;
            for (com.yeamy.sql.statement.Clause li : list) {
                if (f) {
                    clause = new com.yeamy.sql.statement.MultiClause(li);
                    f = false;
                }else {
                    clause.and(li);
                }
            }
            return clause;
    }
}