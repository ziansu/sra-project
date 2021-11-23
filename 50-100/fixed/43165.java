public diag.stn.Diagnosis[] generateDiagnosis() {
    java.util.LinkedList<diag.stn.GraphPath> needDiag = new java.util.LinkedList<>();
    for (diag.stn.Observation ob : observations) {
        if (ob.fixneeded) {
            java.util.LinkedHashSet<diag.stn.GraphPath> pathSet = obsPaths.get(ob);
            for (diag.stn.GraphPath p : pathSet)
                needDiag.add(p);
            
        }
    }
    generateDiagnosis(new diag.stn.Diagnosis(), needDiag, new java.util.ArrayList<>());
    return diagnosisList.toArray(new diag.stn.Diagnosis[diagnosisList.size()]);
}