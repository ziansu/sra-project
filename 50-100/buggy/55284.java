@java.lang.Override
public de.bund.bfr.knime.gis.shapecell.ShapeBlobCell deserialize(org.knime.core.data.DataCellDataInput input) throws java.io.IOException {
    byte[] bytes = new byte[input.readInt()];
    input.readFully(bytes);
    com.vividsolutions.jts.io.WKBReader reader = new com.vividsolutions.jts.io.WKBReader();
    try {
        return new de.bund.bfr.knime.gis.shapecell.ShapeBlobCell(reader.read(bytes));
    } catch (com.vividsolutions.jts.io.ParseException e) {
        throw new java.io.IOException(e.getMessage());
    }
}