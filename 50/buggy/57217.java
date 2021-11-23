public void addFieldID(soot.SootField sf, java.lang.Integer id) {
    java.lang.System.out.println(((("Stored Field ID: " + (soot.jimple.infoflow.nu.GlobalData.getFieldKey(sf))) + " => ") + id));
    fieldIDMap.put(soot.jimple.infoflow.nu.GlobalData.getFieldKey(sf), id);
}