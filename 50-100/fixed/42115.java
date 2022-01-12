protected boolean fire(ca.uqac.lif.cep.fsm.MooreMachine.Transition t, java.lang.Object[] inputs, java.lang.Object[] outputs) {
    m_currentState = t.getDestination();
    t.modifyContext(inputs, outputs, this);
    if (m_outputSymbols.containsKey(m_currentState)) {
        java.lang.Object[] out = m_outputSymbols.get(m_currentState);
        for (int i = 0; i < (outputs.length); i++) {
            outputs[i] = out[i];
        }
        return true;
    }
    return false;
}