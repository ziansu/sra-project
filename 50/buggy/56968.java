@java.lang.Override
public void createTable(hu.elte.bfw1p6.poker.model.entity.PTable t) throws java.rmi.RemoteException {
    hu.elte.bfw1p6.poker.persist.ptable.PTableRepository.save(t);
    java.lang.System.out.println("létrehozta");
}