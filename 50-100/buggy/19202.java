public void put(foam.nanos.boot.Detachable sub, foam.nanos.boot.FObject obj) {
    foam.nanos.boot.NSpec sp = ((foam.nanos.boot.FObject) (obj));
    java.lang.System.out.println(("NSpec: " + (sp.name)));
    foam.nanos.boot.NanoService ns = sp.createService();
    ns.setContext(root_);
    ns.start();
    root_.put(sp.name, ns);
}