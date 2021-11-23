public void addUpdateTime(java.lang.String objectId, org.mpi.vasco.txstore.coordinator.updateEntry uE) {
    org.mpi.vasco.txstore.coordinator.updateEntry v = table.get(objectId);
    if (v == null) {
        table.put(objectId, uE);
    }else {
        if ((v.lc.precedes(uE.lc)) || (v.ts.precedes(uE.ts)))
            table.put(objectId, uE);
        
    }
}