protected void buildTemplateCell(trp.layout.RiText[][] rts) {
    try {
        template = rts[0][0].copy();
    } catch (java.lang.Exception e) {
        template = new trp.layout.RiText(_pApplet);
    }
    template.fill(trp.layout.RiTextGrid.DEFAULT_COLOR);
    template.position(java.lang.Float.MAX_VALUE, java.lang.Float.MAX_VALUE);
    template.alpha(0);
}