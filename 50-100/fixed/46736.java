private static void toYaml(java.lang.StringBuilder sb, java.util.List<org.testng.xml.XmlPackage> packages) {
    if (!(packages.isEmpty())) {
        sb.append("packages:\n");
        for (org.testng.xml.XmlPackage p : packages) {
            org.testng.internal.Yaml.toYaml(sb, "  ", p);
        }
    }
    for (org.testng.xml.XmlPackage p : packages) {
        org.testng.internal.Yaml.toYaml(sb, "  ", p);
    }
}