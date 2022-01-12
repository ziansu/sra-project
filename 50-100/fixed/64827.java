public static java.lang.String getContextInfo(java.lang.String indent, java.util.Collection<org.coreasm.engine.absstorage.Update> updates, org.coreasm.engine.parser.Parser parser, org.coreasm.engine.Specification spec) {
    java.lang.StringBuffer result = new java.lang.StringBuffer();
    if ((updates != null) && ((updates.size()) > 0)) {
        for (org.coreasm.engine.absstorage.Update u : updates) {
            result.append(org.coreasm.engine.EngineTools.getContextInfo(indent, u, parser, spec));
        }
    }
    return result.toString();
}