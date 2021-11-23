public void setEndWire(java.lang.String endWireLabel) {
    for (gerardogtn.com.circuitsolver.data.model.CircuitComponent component : components) {
        if (component.getLabel().equals(endWireLabel)) {
            this.endWire = ((gerardogtn.com.circuitsolver.data.model.Wire) (component));
            return ;
        }
    }
    throw new gerardogtn.com.circuitsolver.util.exception.CircuitComponentNotFoundException();
}