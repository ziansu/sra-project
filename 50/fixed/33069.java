private void serializeData() {
    if ((serializers) != null) {
        for (fr.inria.spirals.repairnator.serializer.AbstractDataSerializer serializer : this.serializers) {
            serializer.serializeData(this.inspector);
        }
    }
}