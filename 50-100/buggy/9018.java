public void targetSizeCheck(shared.logic.support.action.Action a) {
    if (((a.ability) == (shared.roles.Jailor.EXECUTE_)) && ((a.getTargets().size()) > (jailedTargets.size())))
        Exception("Cannot execute someone that isn't jailed");
    
    if ((getPerceivedCharges()) != (shared.logic.support.rules.Rules.UNLIMITED))
        if ((a.getTargets().size()) > (getPerceivedCharges()))
            Exception("Not enough executions for that many targets");
        
    
}