@java.lang.Override
public java.lang.String handleEvent(org.rythmengine.RythmEngine engine, org.rythmengine.internal.CodeBuilder c) {
    java.lang.String tmpl = c.template();
    if (tmpl == null)
        throw new java.lang.RuntimeException((("template for " + (c.getClass().getName())) + " not available"));
    
    tmpl = tmpl.replaceAll("(\\r\\n)", "\n");
    tmpl = tmpl.replaceAll("\\r", "\n");
    return tmpl;
}