private void removeFilter() throws javax.servlet.ServletException {
    if ((filter) != null) {
        hudson.util.PluginServletFilter.removeFilter(filter);
        filter.destroy();
        filter = null;
    }
}