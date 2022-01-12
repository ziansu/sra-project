private void resetPooledVMs() {
    for (at.tuwien.infosys.entities.PooledVM vm : pvmr.findAll()) {
        rpc.stopDockerHost(dhr.findByName(vm.getLinkedhost()).get(0));
        vm.setLinkedhost(null);
        pvmr.save(vm);
    }
}