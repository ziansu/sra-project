public void defineVariable(java.lang.String varName, interp.Data value) {
    java.util.HashMap<java.lang.String, interp.Data> activationRecord = actRecords.getFirst();
    interp.Data var = activationRecord.get(varName);
    if (var == null) {
        activationRecord = currentAR;
        var = activationRecord.get(varName);
    }
    if (var == null) {
        activationRecord.put(varName, value);
    }else {
        var.setData(value);
    }
}