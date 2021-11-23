protected boolean externalNetworksConverged() {
    if ((this.eventSendToOthers) && (!(this.lastIterationSkipped))) {
        this.eventSendToOthers = false;
        return false;
    }else {
        for (java.lang.Boolean converged : this.externalNetworksFinished.values()) {
            if (!converged)
                return false;
            
        }
        return true;
    }
}