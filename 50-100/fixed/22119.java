@java.lang.Override
public void run() {
    try {
        simpledb.server.SimpleDB.init("studentdb");
        java.lang.System.out.println("finished init of SimpleDB");
        simpledb.remote.RemoteDriver d = new simpledb.remote.RemoteDriverImpl();
        java.rmi.Naming.rebind("simpledb", d);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}