@java.lang.Override
public com.manuelemr.mmphotos.presentation.modules.notedetail.viewstate.LoadNoteViewState reduce(com.manuelemr.mmphotos.presentation.modules.notedetail.viewstate.LoadNoteViewState previousState) {
    if ((previousState.getLoadedNote()) != null) {
        com.manuelemr.mmphotos.data.models.Note lodedNote = previousState.getLoadedNote();
        lodedNote.setFavorite(mIsNoteFavorite);
        return new com.manuelemr.mmphotos.presentation.modules.notedetail.viewstate.LoadedNoteViewState(lodedNote);
    }
    return this;
}