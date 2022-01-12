@java.lang.Override
public void init(org.lex.perf.filter.FilterConfig filterConfig) throws org.lex.perf.filter.ServletException {
    try {
        java.lang.String name = filterConfig.getFilterName();
        if ((name != null) && ((name.length()) > 0)) {
            filterName = name;
        }
        indexSeries = org.lex.perf.api.factory.IndexFactory.registerIndexSeries(filterName);
    } catch (java.lang.Error error) {
        org.lex.perf.filter.HTTPFilter.LOGGER.error("", error);
        throw error;
    } catch (java.lang.RuntimeException error) {
        org.lex.perf.filter.HTTPFilter.LOGGER.error("", error);
        throw error;
    }
}