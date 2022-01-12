private edu.unibi.agbi.gnius.core.model.entity.graph.IGraphArc CreateArc(edu.unibi.agbi.gnius.core.model.entity.graph.IGraphNode source, edu.unibi.agbi.gnius.core.model.entity.graph.IGraphNode target) throws edu.unibi.agbi.gnius.core.service.exception.DataGraphServiceException {
    return dataGraphService.connect(source, target);
}