@java.lang.Override
public java.lang.String transitionToString(java.lang.Character nextChar) {
    NumberedTransition transition = transitions.get(nextChar);
    return ((((((("\t" + (id)) + " -> ") + (transition.id)) + " [label=") + nextChar) + "[") + (transition.transitionNumber)) + "]\"]";
}