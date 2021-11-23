@java.lang.Override
public de.bund.bfr.knime.gis.shapecell.ShapeBlobCell deserialize(org.knime.core.data.DataCellDataInput input) throws java.io.IOException {
    byte[] bytes = new byte[input.readInt()];
    input.readFully(bytes);
    try {
        return new de.bund.bfr.knime.gis.shapecell.ShapeBlobCell(new com.vividsolutions.jts.io.WKBReader().read(bytes));
    } catch (com.vividsolutions.jts.io.ParseException e) {
        throw new java.io.IOException(e.getMessage());
    }
}