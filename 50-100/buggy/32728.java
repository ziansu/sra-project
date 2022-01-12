private void addEffect() {
    if (!(blinds.isEmpty())) {
        return ;
    }
    stateManager.getState(arkhados.ClientFog.class).addPreventer();
    filter = new com.shaderblow.filter.colorscale.ColorScaleFilter(ColorRGBA.White.clone(), 0.4F);
    fpp.addFilter(filter);
    app.getViewPort().addProcessor(fpp);
}