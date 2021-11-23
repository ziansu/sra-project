public automatons.Automaton Complement(automatons.Automaton A) {
    automatons.Automaton AComplement = new automatons.Automaton();
    AComplement.startState = A.startState;
    AComplement.variables = A.variables;
    AComplement.trans = A.trans;
    for (java.util.Map.Entry<java.lang.String, java.util.HashMap<java.lang.String, automatons.Transitions>> entryA : A.trans.entrySet()) {
        java.lang.String keyFromStateA = entryA.getKey();
        if (!(A.finalState.contains(keyFromStateA))) {
            if (!(AComplement.finalState.contains(keyFromStateA)))
                AComplement.finalState.add(keyFromStateA);
            
        }
    }
    return AComplement;
}