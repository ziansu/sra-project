@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    if ((_selectedMap) != null)
        towerDefense.setScreen(new net.noviden.towerdefense.MapEditor.MapEditorScreen(towerDefense, _selectedMap));
    
}