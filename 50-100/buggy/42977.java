public void setLayerValues(anl.verdi.gui.FormulaListElement element) {
    anl.verdi.gui.FormulasPanel.Logger.debug("in FormulasPanel setLayerValue");
    if ((element != null) && ((element.getLayerMin()) != (FormulaListElement.NO_LAYER_VALUE))) {
        layerPanel1.setEnabled(true);
        layerPanel1.reset(element.getDefaultZAxis(), element.getLayerMin(), element.getLayerMax(), element.isLayerUsed());
    }else {
        layerPanel1.setEnabled(false);
    }
}