private weka.core.Instance getInstance(br.edu.saocarlos.ifsp.treinamentobalizadorwebservice.models.Movement movement) throws java.lang.Exception {
    weka.core.Instance instance = new weka.core.Instance(movement.getCoordinates().size());
    for (int i = 0; i < (movement.getCoordinates().size()); i++) {
        instance.setValue(i, java.lang.Double.parseDouble(movement.getCoordinates().get(i)));
    }
    return instance;
}