public void addTransition(de.teck.statemachine.persistence.model.Transition transition) {
    if (transition == null)
        return ;
    
    transitions.add(transition);
    if ((transition.getTransitionGraph()) != (this)) {
        transition.setTransitionGraph(this);
    }
}