public org.opentestsystem.rdw.ingest.processor.model.Assessment safeBuild(final org.opentestsystem.rdw.ingest.common.util.DataElementErrorCollector elementErrorCollector) {
    elementErrorCollector.addAll(this.elementErrorCollector);
    return elementErrorCollector.isEmpty() ? asmtBuilder.build() : null;
}