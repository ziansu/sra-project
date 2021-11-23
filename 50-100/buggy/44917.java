@org.junit.Test
public void testGetViewNotTheOnlyOne() throws java.lang.Exception {
    adapter.getView(3, null, parent);
    verify(factory, times(1)).getRenderer(com.sefford.brender.adapters.RendererAdapterTest.EXPECTED_RENDERABLE_ID, postable, null);
    verify(renderer, times(1)).hookUpListeners(renderable);
    verify(renderer, times(1)).render(renderable, 3, false, false);
}