private static java.lang.Object getValue(java.lang.Object object, java.lang.String... args) {
    if ((args.length) > 0) {
        java.lang.String arg = args[0];
        java.lang.Object obj = ((org.json.simple.JSONObject) (object)).get(arg);
        java.lang.String[] newArgs = ((java.lang.String[]) (org.apache.commons.lang.ArrayUtils.remove(args, 0)));
        return org.talend.core.runtime.conf.DefaultConfsManager.getValue(obj, newArgs);
    }else {
        return object;
    }
}