private void resetViewport() {
    final lecho.lib.hellocharts.model.Viewport v = new lecho.lib.hellocharts.model.Viewport(chart.getMaximumViewport());
    v.bottom = (edu.zucc.xk31401419.mycurrencies.utils.MathUtil.getMaxAndMin(rateValuesTab)[1]) * ((float) (0.9));
    v.top = (edu.zucc.xk31401419.mycurrencies.utils.MathUtil.getMaxAndMin(rateValuesTab)[0]) * ((float) (1.1));
    v.left = 0;
    v.right = (numberOfPoints) - 1;
    chart.setMaximumViewport(v);
    chart.setCurrentViewport(v);
}