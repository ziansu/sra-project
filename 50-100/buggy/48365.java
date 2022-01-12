@java.lang.Override
public java.util.List<macrobase.datamodel.Datum> getData(macrobase.ingest.DatumEncoder encoder, java.lang.String timeColumn, java.util.List<java.lang.String> attributes, java.util.List<java.lang.String> lowMetrics, java.util.List<java.lang.String> highMetrics, java.util.List<java.lang.String> auxiliaryAttributes, macrobase.ingest.transform.DataTransformation dataTransformation, java.lang.String baseQuery) throws java.io.IOException, java.sql.SQLException {
    return _getData(encoder, timeColumn, attributes, lowMetrics, highMetrics, baseQuery);
}