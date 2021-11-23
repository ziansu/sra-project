public void undo(com.wyz.lunchfund.PersistentState pstate) {
    for (java.lang.String eater : eaters)
        pstate.people.get(eater).balance += (amount) / (eaters.length);
    
    pstate.people.get(payer).balance -= amount;
}