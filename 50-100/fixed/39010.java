public final void chart_definition() throws lsf.zuba.javacc.ParseException {
    lsf.zuba.javacc.Token a;
    lsf.zuba.javacc.Token b;
    jj_consume_token(9);
    a = jj_consume_token(lsf.zuba.javacc.Chart_type);
    jj_consume_token(12);
    b = jj_consume_token(java.lang.String);
    Chart_content();
    lsf.zuba.javacc.SyntaxChecker.chart_obj.setChartType(("" + (a.toString())));
    lsf.zuba.javacc.SyntaxChecker.chart_obj.setBindTo(("" + (b.toString())));
}