public boolean login(com.univ.alma.middleware.ChatClientInterface a, java.lang.String topic) throws java.rmi.RemoteException {
    java.lang.System.out.println(((a.getName()) + "  s'est connecté...."));
    a.tell("Tu t\'es connect\u00e9 avec succ\u00e8s.\n");
    publish(((a.getName()) + " vient de ce connecté."));
    v.add(a);
    return true;
}