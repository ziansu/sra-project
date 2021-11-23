@java.lang.Override
public java.lang.String getSearchLogs(java.lang.String from, java.lang.String to, final int minLevel) {
    if (logStore.isSearchSupported())
        throw new java.lang.IllegalArgumentException("The underlying log store does not support web-based searching!");
    
    final com.peterphi.std.guice.web.rest.templating.TemplateCall call = templater.template("search");
    call.set("nonce", nonceStore.getValue());
    call.set("fromDatetime", from);
    call.set("toDatetime", to);
    call.set("minLevel", minLevel);
    return call.process();
}