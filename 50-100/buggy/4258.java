protected synchronized void loadInverseRelations() throws dk.statsbiblioteket.doms.client.exceptions.ServerOperationFailed {
    if (invrelsloaded) {
        return ;
    }
    invrelsloaded = true;
    java.util.List<dk.statsbiblioteket.doms.central.Relation> frelations;
    try {
        frelations = api.getInverseRelations(pid);
    } catch (java.lang.Exception e) {
        throw new dk.statsbiblioteket.doms.client.exceptions.ServerOperationFailed("Failed to load inverse relations", e);
    }
    for (dk.statsbiblioteket.doms.central.Relation frelation : frelations) {
        inverseRelations.add(new dk.statsbiblioteket.doms.client.impl.relations.ObjectRelationImpl(frelation.getSubject(), frelation.getPredicate(), frelation.getObject(), factory));
    }
}