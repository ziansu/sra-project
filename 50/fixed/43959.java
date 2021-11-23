@java.lang.Override
public boolean evaluate(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, com.dotmarketing.portlets.rules.conditionlet.UsersBrowserConditionlet.Instance instance) {
    java.lang.String browser = lookupBrowser(request, instance);
    return instance.comparison.perform(browser.toLowerCase(), instance.browser.toLowerCase());
}