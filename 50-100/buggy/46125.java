@java.lang.Override
public int compareTo(com.mygdx.game.entities.components.Rendering.RenderComponent comp) {
    return ((int) (java.lang.Math.floor(((((_sortingLayer) + 0.95F) - (_innerSortingLayer)) - (((comp.getSortingLayer()) + 0.95F) - (comp.getInnerSortingLayer()))))));
}