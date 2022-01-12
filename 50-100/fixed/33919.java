@java.lang.Override
public boolean publish(com.esri.geoportal.harvester.api.DataReference ref) throws com.esri.geoportal.harvester.api.ex.DataOutputException {
    try {
        (counter)++;
        java.lang.System.out.println(java.lang.String.format("%s [%s]", ref.getId(), ref.getLastModifiedDate()));
        java.lang.System.out.println(java.lang.String.format("%s", new java.lang.String(ref.getContent(), "UTF-8")));
        java.lang.System.out.println(java.lang.String.format("--- END OF %d ---", counter));
        java.lang.System.out.println();
        return true;
    } catch (java.io.IOException ex) {
        throw new com.esri.geoportal.harvester.api.ex.DataOutputException(this, "Error publishing data.", ex);
    }
}