public static void changeTmplCntrl(objects.Brick br, int index) {
    windows.sensorWindow.rendererMap3.get(br.uid).setSeriesVisible(0, br.ctrlTmplruns[index]);
    if (br.ctrlTmpl[index]) {
        windows.sensorWindow.tmplButtonsVisible.put(br.uid, windows.sensorWindow.tmplButtons.get(br.uid));
        windows.sensorWindow.buttonPanel.add(windows.sensorWindow.tmplButtons.get(br.uid));
    }else {
        windows.sensorWindow.tmplButtonsVisible.remove(br.uid, windows.sensorWindow.tmplButtons.get(br.uid));
        windows.sensorWindow.buttonPanel.remove(windows.sensorWindow.tmplButtons.get(br.uid));
    }
    windows.sensorWindow.updateButtonPanel();
}