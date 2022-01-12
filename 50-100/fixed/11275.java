public void dispose() {
    for (com.badlogic.ashley.core.EntitySystem sys : com.spaceproject.screens.SpaceScreen.engine.getSystems()) {
        if (sys instanceof com.badlogic.gdx.utils.Disposable)
            ((com.badlogic.gdx.utils.Disposable) (sys)).dispose();
        
    }
    for (com.badlogic.ashley.core.Entity ents : com.spaceproject.screens.SpaceScreen.engine.getEntities()) {
        com.spaceproject.components.TextureComponent tex = ents.getComponent(com.spaceproject.components.TextureComponent.class);
        if (tex != null)
            tex.texture.dispose();
        
    }
}