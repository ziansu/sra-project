@java.lang.Override
public int getItemViewType(int position) {
    return position != ((listOfCharacters.size()) - 1) ? com.sadwyn.iceandfire.views.adapters.CharactersAdapter.ITEM_KEY : isError ? com.sadwyn.iceandfire.views.adapters.CharactersAdapter.ITEM_KEY : com.sadwyn.iceandfire.views.adapters.CharactersAdapter.PROGRESS_KEY;
}