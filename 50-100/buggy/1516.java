@cruise.umple.compiler.Test
public void finalStateInOneConcurrentRegion() {
    assertParse("211_finalState_inOneConcurrentRegion.ump", "[classDefinition][name:Dryer][stateMachine][inlineStateMachine][name:status][state][stateName:On][state][stateName:Rotating][transition][event:dryingCompleted][stateName:Final][||:||][state][stateName:Heating][transition][event:fire][stateName:Off][state][stateName:Off]");
    cruise.umple.compiler.UmpleClass uClass = model.getUmpleClass("Dryer");
    cruise.umple.compiler.State state = uClass.getStateMachine(0).findState("On").getNestedStateMachine(0).findState("Final");
    cruise.umple.compiler.Assert.assertEquals(true, state.isFinalState());
    state = uClass.getStateMachine(0).findState("On").getNestedStateMachine(1).findState("Final");
    cruise.umple.compiler.Assert.assertEquals(null, state);
}