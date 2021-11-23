@java.lang.Override
public void perform() {
    if ((com.apptogo.roperace.manager.CustomActionManager.getInstance().getRegisteredActionCount()) == 0)
        setScoreValue(((getScoreValue()) + 1));
    
}