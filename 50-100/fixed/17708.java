@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(super.equals(obj))) {
        return false;
    }
    com.alibaba.druid.sql.dialect.odps.ast.OdpsSelectQueryBlock other = ((com.alibaba.druid.sql.dialect.odps.ast.OdpsSelectQueryBlock) (obj));
    if ((limit) == null) {
        if ((other.limit) != null)
            return false;
        
    }else
        if (!(limit.equals(other.limit)))
            return false;
        
    
    return true;
}