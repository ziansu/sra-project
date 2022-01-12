public java.lang.Integer[] killEnemy(java.lang.Integer newPiratIds) {
    java.lang.Integer[] deadPirats = new java.lang.Integer[0];
    for (java.lang.Integer piratId : piratIds) {
        if ((piratId / 3) != (newPiratIds / 3)) {
            piratIds = org.eclipse.jetty.util.ArrayUtil.removeFromArray(piratIds, piratId);
            deadPirats = org.eclipse.jetty.util.ArrayUtil.addToArray(deadPirats, piratId, java.lang.Integer.class);
        }
    }
    return deadPirats;
}