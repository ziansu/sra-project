private org.processmining.models.graphbased.directed.petrinet.PetrinetGraph getModel() throws com.rapidminer.operator.OperatorException {
    com.rapidminer.operator.IOObject pnObject = inputModel.getData(com.rapidminer.operator.IOObject.class);
    if (pnObject != null) {
        if (pnObject instanceof org.rapidprom.ioobjects.PetriNetIOObject) {
            return ((org.rapidprom.ioobjects.PetriNetIOObject) (pnObject)).getArtifact();
        }else
            if (pnObject instanceof org.rapidprom.ioobjects.DataPetriNetIOObject) {
                return ((org.rapidprom.ioobjects.DataPetriNetIOObject) (pnObject)).getArtifact();
            }else {
                throw new com.rapidminer.operator.OperatorException(("Wrong input model " + pnObject));
            }
        
    }else {
        return null;
    }
}