@cruise.umple.compiler.Test
public void finalStateWithAction() {
    assertParse("211_finalState_withAction.ump", "[classDefinition][name:DVDplayer][stateMachine][inlineStateMachine][name:DVDplayerStatus][state][stateName:NormalOperation][state][stateName:On][state][stateName:Playing][transition][event:stop][stateName:Stopped][state][stateName:Stopped][transition][event:play][stateName:Playing][transition][event:pause][stateName:Paused][state][stateName:history][state][stateName:Off][transition][event:turnOn][action][code:actionCode][stateName:Final]");
    cruise.umple.compiler.UmpleClass uClass = model.getUmpleClass("DVDplayer");
    cruise.umple.compiler.State final1 = uClass.getStateMachine(0).findState("NormalOperation").getNestedStateMachine(0).findState("Final");
    cruise.umple.compiler.Assert.assertEquals(true, final1.isFinalState());
}