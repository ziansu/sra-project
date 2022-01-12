@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if (!(o instanceof org.openstreetmap.josm.gui.io.ChangesetCommentModel))
        return ;
    
    java.lang.String newValue = ((java.lang.String) (arg));
    java.lang.String oldValue = getTagEditorValue(key);
    if (oldValue == null) {
        oldValue = "";
    }
    if (!(oldValue.equals(newValue))) {
        setProperty(key, ((java.lang.String) (arg)));
    }
}