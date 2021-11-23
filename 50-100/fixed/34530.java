private void resetPooledVMs() {
    for (at.tuwien.infosys.entities.PooledVM vm : pvmr.findAll()) {
        if (!(dhr.findByName(vm.getLinkedhost()).isEmpty())) {
            rpc.stopDockerHost(dhr.findByName(vm.getLinkedhost()).get(0));
        }
        vm.setLinkedhost(null);
        pvmr.save(vm);
    }
}