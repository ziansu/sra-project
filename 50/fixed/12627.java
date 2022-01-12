public void balance(edu.iis.mto.serverloadbalancer.Server[] servers, edu.iis.mto.serverloadbalancer.Vm[] vms) {
    for (edu.iis.mto.serverloadbalancer.Vm vm : vms) {
        addToLessLoadedServer(servers, vm);
    }
}