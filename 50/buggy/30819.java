@java.lang.Override
public int getItemViewType(int position) {
    if (position != (listOfCharacters.size()))
        return com.sadwyn.iceandfire.views.adapters.CharactersAdapter.ITEM_KEY;
    else
        if (isError)
            return com.sadwyn.iceandfire.views.adapters.CharactersAdapter.ITEM_KEY;
        else
            return com.sadwyn.iceandfire.views.adapters.CharactersAdapter.PROGRESS_KEY;
        
    
}