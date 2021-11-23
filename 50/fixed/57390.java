@java.lang.Override
public com.ontometrics.scraper.extraction.DefaultFieldExtractor field(java.lang.String label, java.lang.String element) {
    this.fieldsToGet.add(new com.ontometrics.scraper.extraction.DesignatedField(label, element));
    return this;
}