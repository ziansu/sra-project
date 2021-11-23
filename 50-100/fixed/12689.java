@java.lang.Override
public void dispose() {
    for (com.badlogic.ashley.core.Entity entity : renderQueue) {
        com.spaceproject.components.TextureComponent tex = Mappers.texture.get(entity);
        if ((tex.texture) != null)
            tex.texture.dispose();
        
    }
    for (com.spaceproject.SpaceBackgroundTile tile : com.spaceproject.systems.LoadingSystem.getTiles()) {
        tile.tex.dispose();
    }
}