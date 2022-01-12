protected boolean fire(ca.uqac.lif.cep.fsm.MooreMachine.Transition t, java.lang.Object[] inputs, java.lang.Object[] outputs) {
    m_currentState = t.getDestination();
    t.modifyContext(inputs, outputs, this);
    if (m_outputSymbols.containsKey(m_currentState)) {
        outputs[0] = m_outputSymbols.get(m_currentState);
        return true;
    }
    return false;
}