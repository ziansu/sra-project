@org.junit.Test
public void testGetViewOnlyOne() throws java.lang.Exception {
    adapter.getView(0, null, parent);
    verify(factory, times(1)).getRenderer(com.sefford.brender.adapters.RendererAdapterTest.EXPECTED_RENDERABLE_ID, postable, view);
    verify(renderer, times(1)).hookUpListeners(renderable);
    verify(renderer, times(1)).render(renderable, 0, true, true);
}