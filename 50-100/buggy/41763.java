@java.lang.Override
public sernet.verinice.service.model.ObjectModelContainer loadAll() {
    sernet.verinice.service.model.ObjectModelContainer container = new sernet.verinice.service.model.ObjectModelContainer();
    container.setAllLabels(getAllLabels());
    container.setAllPossibleProperties(getAllPossibleProperties());
    container.setAllRelationLabels(getAllRelationLabels());
    container.setAllRelationPartners(getAllRelationPartners());
    container.setAllTypeIds(getAllTypeIDs());
    container.setPossibleChildren(getAllPossibleChildren());
    container.setPossibleParents(getAllPossibleParents());
    return container;
}