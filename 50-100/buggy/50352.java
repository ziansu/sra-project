private boolean checkIfDeactivated(final com.qcadoo.model.api.DataDefinition dataDefinition, final com.qcadoo.model.api.Entity technology, final com.qcadoo.model.api.Entity existingTechnology) {
    if ((isTechnologyIsAlreadyAccepted(technology, existingTechnology)) && (com.qcadoo.mes.technologies.TechnologyService.CONST_TECHNOLOGY.equals(dataDefinition.getName()))) {
        if ((technology.isActive()) != (existingTechnology.isActive())) {
            return true;
        }
    }
    return false;
}