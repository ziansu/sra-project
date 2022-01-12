public void addService(domain.ServiceEntity serv) {
    domain.Trainer actTrainer;
    java.util.Collection<domain.ServiceEntity> services;
    java.util.Collection<domain.Trainer> trainers;
    actTrainer = this.findByPrincipal();
    services = actTrainer.getServices();
    if (!(services.contains(serv))) {
        trainers = serv.getTrainers();
        trainers.add(actTrainer);
        serv.setTrainers(trainers);
        services.add(serv);
        actTrainer.setServices(services);
        this.save(actTrainer);
    }
}