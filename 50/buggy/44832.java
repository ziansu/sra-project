@java.lang.Override
public synchronized void join(se.umu.cs.dist.ht15.dali_ens15bsf.com.RemoteMember newM, java.lang.String groupID) throws java.rmi.RemoteException {
    java.lang.System.out.println("HEY");
    super.notifyJoin(newM, groupID);
}