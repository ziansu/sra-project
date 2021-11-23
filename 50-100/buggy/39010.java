public static final void chart_definition() throws lsf.zuba.javacc.ParseException {
    lsf.zuba.javacc.Token a;
    lsf.zuba.javacc.Token b;
    lsf.zuba.javacc.SyntaxChecker.jj_consume_token(9);
    a = lsf.zuba.javacc.SyntaxChecker.jj_consume_token(lsf.zuba.javacc.Chart_type);
    lsf.zuba.javacc.SyntaxChecker.jj_consume_token(12);
    b = lsf.zuba.javacc.SyntaxChecker.jj_consume_token(java.lang.String);
    lsf.zuba.javacc.SyntaxChecker.Chart_content();
    lsf.zuba.javacc.SyntaxChecker.chart_obj.setChartType(("" + (a.toString())));
    lsf.zuba.javacc.SyntaxChecker.chart_obj.setBindTo(("" + (b.toString())));
}