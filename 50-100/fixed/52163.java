private static org.eclipse.rdf4j.model.IRI makeID(java.lang.String cbe, java.lang.String type) {
    return be.fedict.lodtools.cbe.Main.F.createIRI(new java.lang.StringBuilder(be.fedict.lodtools.cbe.Main.domain).append(type).append(cbe.replaceAll("\\.", "_")).append("#id").toString());
}