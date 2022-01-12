@java.lang.Override
public void report(dyvil.tools.parsing.marker.Marker error) {
    final boolean isError = error.isError();
    if ((!(this.hasSyntaxErrors)) && isError) {
        this.hasSyntaxErrors = true;
    }
    if ((this.reportErrors) || (!isError)) {
        super.report(error);
    }
}