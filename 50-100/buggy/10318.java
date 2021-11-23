public static java.lang.Iterable<?> getIterable(pcgen.cdom.enumeration.CharID id, java.lang.String... keys) {
    java.lang.String k1 = keys[0];
    java.lang.String k2 = ((keys.length) == 1) ? keys[1] : "";
    pcgen.output.base.ModelFactory modelFactory = pcgen.output.publish.OutputDB.outModels.get(k1, k2);
    if (modelFactory == null) {
        return null;
    }
    return modelFactory.generate(id);
}