public java.lang.String encodeScriptEvents(javax.faces.context.FacesContext context, javax.faces.component.UIComponent component) {
    java.lang.StringBuilder events = new java.lang.StringBuilder();
    events.append("var events = ");
    org.richfaces.renderkit.ScriptOptions options = new org.richfaces.renderkit.ScriptOptions(component);
    options.addEventHandler("oneditactivation");
    options.addEventHandler("onviewactivation");
    options.addEventHandler("oneditactivated");
    options.addEventHandler("onviewactivated");
    options.addEventHandler("onchange");
    events.append(options.toScript());
    return events.toString();
}