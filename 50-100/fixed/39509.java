public boolean isImpactedByMeddraVersioning(com.dbms.entity.cqt.CmqBase190 cmq) {
    if (cmq != null) {
        if (cmq.isImpactedByMeddraVersioning())
            return true;
        
        com.dbms.entity.cqt.CmqBaseTarget cmqTarget = myCmqTargetService.findByCode(cmq.getCmqCode());
        if ((cmqTarget != null) && (cmqTarget.isImpactedByMeddraVersioning()))
            return true;
        
    }
    return false;
}