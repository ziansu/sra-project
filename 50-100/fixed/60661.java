private void setTimeValues(anl.verdi.gui.FormulaListElement element) {
    anl.verdi.gui.FormulasPanel.Logger.debug("in FormulasPanel setTimeValues");
    if (((element != null) && ((element.getTimeMin()) != (FormulaListElement.NO_TIME_VALUE))) && ((element.getDefaultTimeAxis()) != null)) {
        timePanel1.setEnabled(true);
        timePanel1.reset(element.getDefaultTimeAxis(), element.getTimeMin(), element.getTimeMax(), element.isTimeUsed());
    }else {
        timePanel1.setEnabled(false);
    }
}