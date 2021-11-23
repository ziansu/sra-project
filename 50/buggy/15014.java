public void addModel(edu.isi.karma.kr2rml.mapping.R2RMLMappingIdentifier modelIdentifier) {
    if (modelIdentifiers.containsKey(modelIdentifier.getName())) {
        readModelParsers.remove(modelIdentifier.getName());
    }
    this.modelIdentifiers.put(modelIdentifier.getName(), modelIdentifier);
}