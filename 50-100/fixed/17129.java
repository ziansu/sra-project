@cruise.umple.compiler.Test
public void hasFinalStates_NotConcurrent() {
    cruise.umple.compiler.Assert.assertEquals(false, sm.hasFinalStates());
    new cruise.umple.compiler.State("s1", sm);
    cruise.umple.compiler.Assert.assertEquals(false, sm.hasFinalStates());
    new cruise.umple.compiler.State("Final", sm);
    cruise.umple.compiler.Assert.assertEquals(true, sm.hasFinalStates());
}