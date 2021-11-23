public void activate(tatami.core.agent.AgentEvent activatingEvent) {
    activationEvent = activatingEvent;
    while ((currentStatement) < (cbd.getStatements().size()))
        if (!(handleStatement(cbd.getStatements().get(((currentStatement)++))))) {
            currentStatement = 0;
            st.clearSymbolTable();
            return ;
        }
    
}