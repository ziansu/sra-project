public boolean checkTuple(com.github.dakusui.jcunit.core.tuples.Tuple tuple) throws com.github.dakusui.jcunit.exceptions.UndefinedSymbol {
    com.github.dakusui.jcunit.fsm.ScenarioSequence<SUT> seq = new com.github.dakusui.jcunit.fsm.ScenarioSequence.BuilderFromTuple<SUT>().setTuple(tuple).setFSMName(this.fsmName).setHistoryLength(this.historyLength).build();
    return checkFSM(this.fsmName, seq);
}