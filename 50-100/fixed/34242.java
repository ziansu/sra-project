@java.lang.Override
protected org.springframework.web.servlet.View loadView(java.lang.String viewName, java.util.Locale locale) throws com.mitchellbosecke.pebble.error.PebbleException {
    if (viewName.endsWith(".html")) {
        viewName = viewName.substring(0, ((viewName.length()) - 5));
    }
    org.woodylab.boot.pebble.web.PebbleView view = new org.woodylab.boot.pebble.web.PebbleView(pebbleEngine, viewName);
    view.setApplicationContext(getApplicationContext());
    view.setServletContext(getServletContext());
    return view;
}