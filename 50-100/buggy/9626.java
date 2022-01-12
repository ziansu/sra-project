@java.lang.Override
public void setParameter(int i, double p) {
    if ((this.stateWeights) != null) {
        if (i < (this.stateWeights.length)) {
            this.stateWeights[i] = p;
        }
    }else
        if ((this.stateActionWeights) != null) {
            if (i < (this.stateActionWeights.length)) {
                this.stateActionWeights[i] = p;
            }
        }
    
    throw new java.lang.RuntimeException("Parameter index out of bounds; parameter cannot be set.");
}