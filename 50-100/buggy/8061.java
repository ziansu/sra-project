@org.junit.Test
public void testRemoveThing_IsCalled_Once() throws java.lang.Exception {
    tvao.mmad.itu.tingle.Model.Thing thing = new tvao.mmad.itu.tingle.Model.Thing();
    org.mockito.Mockito.when(_sut.removeThing(thing.getId())).thenReturn(true);
    _sut.removeThing(thing);
    org.mockito.Mockito.verify(_sut, org.mockito.Mockito.atLeastOnce()).removeThing(thing.getId());
}