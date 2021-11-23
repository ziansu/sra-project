@cruise.umple.compiler.Test
public void getFinalStates_NotConcurrent() {
    cruise.umple.compiler.Assert.assertEquals(0, sm.getFinalStates().size());
    new cruise.umple.compiler.State("s1", sm);
    cruise.umple.compiler.Assert.assertEquals(0, sm.getFinalStates().size());
    new cruise.umple.compiler.State("Final", sm);
    cruise.umple.compiler.Assert.assertEquals(1, sm.getFinalStates().size());
}