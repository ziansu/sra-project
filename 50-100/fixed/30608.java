public java.util.List<java.lang.Integer> killEnemy(java.lang.Integer newPiratIds) {
    java.util.List<java.lang.Integer> deadPirats = new java.util.ArrayList<>();
    for (java.lang.Integer piratId : piratIds) {
        if ((piratId / 3) != (newPiratIds / 3)) {
            piratIds = org.eclipse.jetty.util.ArrayUtil.removeFromArray(piratIds, piratId);
            deadPirats.add(piratId);
        }
    }
    return deadPirats;
}