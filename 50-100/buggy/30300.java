@java.lang.Override
public void initFromSavedState(@android.support.annotation.Nullable
android.os.Bundle savedState) {
    super.initFromSavedState(savedState);
    if (savedState != null) {
        if (!(savedState.getBoolean(fm.kirtsim.kharos.noteapp.ui.notelist.NotesListViewMvcImpl.ARG_RIGHT_SIDE_CONTAINER_VISIBLE)))
            rightSideContainer.setTranslationX(RIGHT_SIDE_CONTAINER_MAX_TRANSLATION_X);
        
        if (!(savedState.getBoolean(fm.kirtsim.kharos.noteapp.ui.notelist.NotesListViewMvcImpl.ARG_ADD_BUTTON_VISIBLE)))
            addNoteButton.setTranslationY(FAB_MAX_TRANSLATION_Y);
        
    }
}