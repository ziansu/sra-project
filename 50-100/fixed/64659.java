private static net.sf.jasperreports.engine.design.JRDesignStaticText createStaticText(int x, int y, int width, int height, java.awt.Color color, int fontSize, java.lang.Boolean isBold, java.lang.String text, net.sf.jasperreports.engine.type.HorizontalTextAlignEnum alligment, java.awt.Color back) {
    net.sf.jasperreports.engine.design.JRDesignStaticText st = com.sourcio.hrm.views.JasperReportsUtils.createStaticText(x, y, width, height, color, fontSize, isBold, text, alligment);
    return st;
}