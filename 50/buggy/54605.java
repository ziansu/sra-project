@java.lang.Override
public void enviarTodos(org.ibit.rol.sac.model.SiaJob siaJob) throws org.ibit.rol.sac.persistence.delegate.DelegateException {
    try {
        getFacade().enviarTodos(siaJob);
    } catch (java.rmi.RemoteException e) {
        throw new org.ibit.rol.sac.persistence.delegate.DelegateException(e);
    }
}