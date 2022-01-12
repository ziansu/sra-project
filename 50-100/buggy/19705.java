@java.lang.Override
public void actionPerformed(sheep.gui.WidgetAction widgetAction) {
    if ((widgetAction.getSource()) == (singleplayer)) {
        boardController.createGameState(false, false);
        android.util.Log.d(android.content.ContentValues.TAG, "actionPerformed: singleplayer");
    }else
        if ((widgetAction.getSource()) == (multiplayer)) {
            android.util.Log.d(android.content.ContentValues.TAG, "actionPerformed: multiplayer");
        }else
            if ((widgetAction.getSource()) == (instructions)) {
                android.util.Log.d(android.content.ContentValues.TAG, "actionPerformed: instructions");
            }
        
    
}