@java.lang.Override
public void init(org.lex.perf.filter.FilterConfig filterConfig) throws org.lex.perf.filter.ServletException {
    java.lang.String name = filterConfig.getFilterName();
    if ((name != null) && ((name.length()) > 0)) {
        filterName = name;
    }
    indexSeries = org.lex.perf.api.factory.IndexFactory.registerIndexSeries(filterName);
}