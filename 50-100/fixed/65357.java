private void fillIterateStatment(org.eclipse.jubula.client.archive.dto.IterateDTO iterateDTO, org.eclipse.jubula.client.core.model.IIteratePO iteratePO) {
    org.eclipse.jubula.client.archive.dto.NodeDTO container = new org.eclipse.jubula.client.archive.dto.NodeDTO(iteratePO.getDoBranch());
    fillContainer(container, iteratePO.getDoBranch());
    iterateDTO.addNode(container);
    addParamDesc(iterateDTO, iteratePO);
    addTestDataManager(iterateDTO, iteratePO);
}