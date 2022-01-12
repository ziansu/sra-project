@java.lang.Override
public java.lang.String handleEvent(org.rythmengine.RythmEngine engine, org.rythmengine.internal.CodeBuilder c) {
    java.lang.String tmpl = c.template();
    if (tmpl != null) {
        tmpl = tmpl.replaceAll("(\\r\\n)", "\n");
        tmpl = tmpl.replaceAll("\\r", "\n");
    }
    return tmpl;
}