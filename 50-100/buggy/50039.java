@java.lang.Override
public int modifyGateway(com.github.qiu1995.noname.gproject.control.core.entity.Gateway gateway) {
    if ((gateway.getID()) <= 0) {
        throw new java.lang.IllegalArgumentException("Gateway ID 应该大于0！");
    }
    org.hibernate.Transaction tx = this._M_session.beginTransaction();
    com.github.qiu1995.noname.gproject.control.core.entity.Gateway tmp = this.getGatewayByID(gateway.getID());
    if (tmp == null) {
        tx.rollback();
        throw new java.lang.IllegalArgumentException("Gateway ID 不存在！");
    }
    this._M_session.saveOrUpdate(gateway.clone());
    tx.commit();
    return 0;
}