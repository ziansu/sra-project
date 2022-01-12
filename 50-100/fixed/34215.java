protected void setObsMemData() {
    obsMemData.get(0).setYValue(toMB(javaMem));
    obsMemData.get(1).setYValue(toMB(cMem));
    obsMemData.get(2).setYValue(toMB(pythonMem));
    obsMemData.get(3).setYValue(toMB(cybobMem));
}