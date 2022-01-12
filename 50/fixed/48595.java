public final lsf.zuba.vizobj.ChartParameter Visualization() throws lsf.zuba.javacc.ParseException {
    jj_consume_token(8);
    chart_definition();
    jj_consume_token(0);
    return lsf.zuba.javacc.SyntaxChecker.chart_obj;
}