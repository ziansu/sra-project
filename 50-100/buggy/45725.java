@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    if (((selectedGO) != null) && (!(delete.isDisabled()))) {
        com.mbrlabs.mundus.utils.Log.traceTag(com.mbrlabs.mundus.ui.modules.Outline.TAG, "Remove game object [{}].", selectedGO);
        removeGo(selectedGO);
        com.mbrlabs.mundus.core.Mundus.postEvent(new com.mbrlabs.mundus.events.SceneGraphChangedEvent());
    }
}