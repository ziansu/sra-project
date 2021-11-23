public void thinner() {
    if ((stroke.getLineWidth()) >= 2.1F) {
        java.lang.System.out.println(stroke.getLineWidth());
        java.math.BigDecimal bd = new java.math.BigDecimal(java.lang.Float.toString(((stroke.getLineWidth()) - 2.0F)));
        bd = bd.setScale(1, java.math.BigDecimal.ROUND_HALF_UP);
        stroke = new java.awt.BasicStroke(bd.floatValue());
        graphics2D.setStroke(stroke);
    }
}