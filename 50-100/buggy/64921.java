@java.lang.Override
protected java.util.List<java.lang.Integer> processData(java.sql.Connection connection) throws java.lang.Exception {
    java.util.LinkedList<java.lang.Integer> result = new java.util.LinkedList<>();
    for (int fatherId = unitId; ;) {
        fatherId = cn.edu.fudan.dao.UnitFieldDAO.fatherId(connection, fatherId);
        if (fatherId == 0)
            break;
        
        result.addFirst(fatherId);
    }
    return result;
}