@java.lang.Override
public void onBindViewHolder(com.pedrogomez.renderers.RendererViewHolder viewHolder, int position) {
    T content = getItem(position);
    rendererBuilder.withContent(content);
    com.pedrogomez.renderers.Renderer<T> renderer = viewHolder.getRenderer();
    if (renderer == null) {
        throw new com.pedrogomez.renderers.exception.NullRendererBuiltException("RendererBuilder have to return a not null renderer");
    }
    renderer.setContent(content);
    updateRendererExtraValues(content, renderer, position);
    renderer.render();
}