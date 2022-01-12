@java.lang.Override
public com.google.gson.JsonElement serialize(org.project.openbaton.nubomedia.api.openshift.json.EnviromentVariable src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
    if ((src.getValue()) == null) {
        return null;
    }else {
        return context.serialize(src);
    }
}