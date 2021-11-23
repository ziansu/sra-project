private edu.unibi.agbi.gnius.core.model.entity.graph.IGraphNode CreatePlace() throws edu.unibi.agbi.gnius.core.service.exception.DataGraphServiceException {
    return dataGraphService.create(Element.Type.PLACE, ((java.lang.Math.random()) * 1000), ((java.lang.Math.random()) * 800));
}