private java.lang.String tryToGetDescription(java.lang.Object object) {
    if (object instanceof cz.martlin.jaxon.j2k.abstracts.JackToKlaxonSerializable) {
        cz.martlin.jaxon.j2k.abstracts.JackToKlaxonSerializable serializable = ((cz.martlin.jaxon.j2k.abstracts.JackToKlaxonSerializable) (object));
        return serializable.jaxonDescription();
    }
    return null;
}