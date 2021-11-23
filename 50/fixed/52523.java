public void undo(com.wyz.lunchfund.PersistentState pstate) {
    for (java.lang.String eater : eaters)
        pstate.people.get(eater).balance += split;
    
    pstate.people.get(payer).balance -= (split) * (eaters.length);
}