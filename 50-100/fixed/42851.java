protected void setObsMemData() {
    obsMemData.get(0).setYValue(toMB(pythonMem));
    obsMemData.get(1).setYValue(toMB(javaMem));
    obsMemData.get(2).setYValue(toMB(cMem));
    obsMemData.get(3).setYValue(toMB(cybobMem));
}