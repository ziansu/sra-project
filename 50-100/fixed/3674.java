@java.lang.Override
public java.lang.String process(org.cbioportal.genomeNexus.models.AnnotatedRecord i) throws java.lang.Exception {
    java.lang.String to_write = "";
    for (java.lang.String field : i.getFieldNames()) {
        to_write += (i.getClass().getMethod(("get" + field)).invoke(i)) + "\t";
    }
    for (java.lang.String additionalValue : i.getAdditionalProperties().values()) {
        to_write += additionalValue + "\t";
    }
    return to_write.substring(0, to_write.length());
}