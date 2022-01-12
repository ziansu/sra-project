public int compare(com.mygdx.game.entities.components.Rendering.RenderComponent d, com.mygdx.game.entities.components.Rendering.RenderComponent d1) {
    return ((int) (java.lang.Math.floor(((((d.getSortingLayer()) + 0.95F) - (d.getInnerSortingLayer())) - (((d1.getSortingLayer()) + 0.95F) - (d1.getInnerSortingLayer()))))));
}