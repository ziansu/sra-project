@java.lang.Override
public void setPlayableShapeFragment() {
    if ((getChordShapes().size()) > 0) {
        final com.androiddeveloper.webprog26.ghordsgenerator.engine.models.ChordShape chordShape = getChordShapes().get(getCurrentShapePosition());
        if (chordShape != null) {
            new com.androiddeveloper.webprog26.ghordsgenerator.engine.commands.LoadPlayShapeFragmentCommand(getFragmentManager(), getContainerViewId(), chordShape).execute();
        }
        android.util.Log.i(com.androiddeveloper.webprog26.ghordsgenerator.engine.managers.screens_managers.PlayShapeActivityManager.TAG, ("load Fragment with shape " + (getChordShapes().get(getCurrentShapePosition()))));
    }
}