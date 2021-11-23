@java.lang.Override
@java.lang.SuppressWarnings(value = "rawtypes")
public void init(org.apache.solr.common.util.NamedList args) {
    java.lang.String valuesStr = ((java.lang.String) (args.get("values")));
    values = valuesStr.split(",");
    string = ((java.lang.String) (args.get("string")));
    missingId = ((java.lang.String) (args.get("missingId")));
}