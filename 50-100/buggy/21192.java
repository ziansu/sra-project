@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent evt) {
    final java.lang.String eventName = evt.getPropertyName();
    if (eventName.equals("game")) {
        setScreen(gameScreen);
    }else
        if ((eventName.equals("time")) || (eventName.equals("dead"))) {
            createMainMenuScreen();
            setScreen(mainMenuScreen);
        }else
            if (eventName.equals("finish")) {
                createMainMenuScreen();
                setScreen(mainMenuScreen);
            }
        
    
}