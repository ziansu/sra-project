@java.lang.Override
public long deleteByQuery(org.apache.gora.query.Query<K, T> query) {
    try {
        long deletedRows = 0;
        org.apache.gora.query.Result<K, T> result = query.execute();
        while (result.next()) {
            if (delete(result.getKey()))
                deletedRows++;
            
        } 
        return deletedRows;
    } catch (java.lang.Exception e) {
        return 0;
    }
}