private void oCREngineComboBoxStateChanged(richtercloud.document.scanner.ifaces.OCREngineConf cREngineConf) {
    richtercloud.document.scanner.ocr.OCREngineConfPanel<?> cREngineConfPanel = this.oCREngineConfPanelMap.get(cREngineConf.getClass());
    this.oCRDialogPanel.removeAll();
    this.oCRDialogPanel.add(cREngineConfPanel);
    this.oCRDialogPanel.revalidate();
    this.pack();
    this.oCRDialogPanel.repaint();
}