private static void toYaml(java.lang.StringBuilder sb, java.lang.String key, java.lang.String sp, java.util.Map<java.lang.String, java.lang.String> parameters) {
    if ((parameters.size()) > 0) {
        sb.append(sp).append(key).append(": ");
        org.testng.internal.Yaml.mapToYaml(parameters, sb);
    }
}