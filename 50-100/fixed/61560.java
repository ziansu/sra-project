@java.lang.Override
public r48.map.StuffRenderer rendererFromMap(r48.RubyIO map) {
    r48.map.tiles.ITileRenderer tileRenderer = new r48.map.tiles.IkaTileRenderer(imageLoader);
    r48.map.events.IEventGraphicRenderer eventRenderer = new r48.map.events.IkaEventGraphicRenderer(imageLoader);
    return new r48.map.StuffRenderer(imageLoader, tileRenderer, eventRenderer, r48.map.StuffRenderer.prepareTraditional(tileRenderer, new int[]{ 0 }, eventRenderer, imageLoader, map, "Back", true, true, 0, 0, (-1), (-1), 1));
}