@java.lang.Override
public void handleMouseClick(int x, int y, int button) {
    mw.client.gui.ImageTile clickedTile = this.getClickedTile(x, y);
    mw.client.model.ModelTile clickedModelTile = mw.client.controller.ModelViewMapping.singleton().getModelTile(clickedTile);
    if (clickedModelTile != null) {
        if (button == 1)
            mw.client.controller.ActionInterpreter.singleton().primarySelect(clickedTile);
        
    }
}