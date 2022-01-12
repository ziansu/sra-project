public static void writeChart(@javax.annotation.Nonnull
java.lang.String mediaType, @javax.annotation.Nonnull
java.io.OutputStream stream, @javax.annotation.Nonnull
org.jfree.chart.JFreeChart chart, @javax.annotation.Nonnegative
int width, @javax.annotation.Nonnegative
int height) throws java.io.IOException {
    for (ec.util.chart.swing.JFreeChartWriter writer : org.openide.util.Lookup.getDefault().lookupAll(ec.util.chart.swing.JFreeChartWriter.class)) {
        if (mediaType.equals(writer.getMediaType())) {
            writer.writeChart(stream, chart, width, height);
            return ;
        }
    }
    throw new java.io.IOException((("Media type '" + mediaType) + "' not supported"));
}