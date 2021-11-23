public com.ibm.ets.ita.ce.store.model.CeInstance getInstanceNamed(com.ibm.ets.ita.ce.store.core.ActionContext pAc, java.lang.String pInstName) {
    com.ibm.ets.ita.ce.store.model.CeInstance result = null;
    if (pInstName != null) {
        if ((this.allInstances) != null) {
            result = this.allInstances.get(com.ibm.ets.ita.ce.store.core.InstanceRepository.getKeyNameFor(pAc, pInstName));
        }
    }
    return result;
}