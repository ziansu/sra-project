@java.lang.Override
public void setUser(com.silicolife.textmining.core.datastructures.dataaccess.database.dataaccess.implementation.model.core.dao.UsersLogged userLogged) throws com.silicolife.textmining.core.interfaces.core.dataaccess.exception.ANoteException {
    if ((this.userLogged.getCurrentUserLogged()) == null) {
        login(userLogged.getCurrentUserLogged().getAuUsername(), userLogged.getCurrentUserLogged().getAuPassword());
    }else {
        login(userLogged.getCurrentUserLogged().getAuUsername(), userLogged.getCurrentUserLogged().getAuPassword());
    }
}