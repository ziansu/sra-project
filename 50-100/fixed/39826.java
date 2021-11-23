protected boolean externalNetworksConverged() {
    if (false) {
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