@java.lang.Override
public void actionPerformed(sheep.gui.WidgetAction widgetAction) {
    if ((widgetAction.getSource()) == (singleplayer)) {
        android.util.Log.d(android.content.ContentValues.TAG, "actionPerformed: singleplayer");
        boardController.createGameState(false, false);
    }else
        if ((widgetAction.getSource()) == (multiplayer)) {
            android.util.Log.d(android.content.ContentValues.TAG, "actionPerformed: multiplayer");
        }else
            if ((widgetAction.getSource()) == (instructions)) {
                android.util.Log.d(android.content.ContentValues.TAG, "actionPerformed: instructions");
            }
        
    
}