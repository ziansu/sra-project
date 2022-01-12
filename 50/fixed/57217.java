public void addFieldID(soot.SootField sf, java.lang.Integer id) {
    fieldIDMap.put(soot.jimple.infoflow.nu.GlobalData.getFieldKey(sf), id);
}