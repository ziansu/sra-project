@java.lang.Override
public void removerPorId(java.lang.Integer id) throws java.sql.SQLException {
    try {
        codigoalvo.entity.Transacao transacaoBanco = this.dao.buscar(id);
        this.dao.beginTransaction();
        this.dao.removerPorId(id);
        this.dao.commit();
    } catch (java.lang.Throwable exc) {
        this.dao.rollback();
        throw new java.sql.SQLException(exc);
    }
}