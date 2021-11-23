@java.lang.Override
@java.lang.SuppressWarnings(value = "rawtypes")
public void init(org.apache.solr.common.util.NamedList args) {
    java.lang.String valuesStr = ((java.lang.String) (args.get("values")));
    values = (valuesStr != null) ? valuesStr.split(",") : new java.lang.String[0];
    string = ((java.lang.String) (args.get("string")));
    missingId = ((java.lang.String) (args.get("missingId")));
}