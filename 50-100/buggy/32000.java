public static org.boris.pecoff4j.ResourceEntry[] findResources(org.boris.pecoff4j.ResourceDirectory rd, int type, int name, int lang) {
    java.util.List<org.boris.pecoff4j.ResourceEntry> entries = new java.util.ArrayList();
    org.boris.pecoff4j.util.ResourceHelper.findResources(rd, type, name, lang, entries);
    return entries.toArray(new org.boris.pecoff4j.ResourceEntry[0]);
}