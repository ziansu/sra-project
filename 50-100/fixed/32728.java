private void addEffect() {
    stateManager.getState(arkhados.ClientFog.class).addPreventer();
    if (!(blinds.isEmpty())) {
        return ;
    }
    filter = new com.shaderblow.filter.colorscale.ColorScaleFilter(ColorRGBA.White.clone(), 0.4F);
    fpp.addFilter(filter);
    app.getViewPort().addProcessor(fpp);
}