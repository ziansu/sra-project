protected jacoco.report.internal.html.parse.NewParseItem parsePropagate(java.util.Map m, jacoco.report.internal.html.parse.NewParseItem p) {
    java.lang.Object val;
    if ((val = m.get("propagate")) != null) {
        log("Found \"propagate\"");
        if (val instanceof java.lang.Boolean) {
            p.setPropagate(((boolean) (val)));
        }else {
            err(("Invalid value for \"propagate\": " + val));
        }
    }
    return p;
}