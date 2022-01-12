@java.lang.Override
public void setCharacters(java.util.List<java.lang.Character> characters) {
    marvel.erickmaeda.com.marvelcharacters.ui.adapters.CharactersAdapter charactersAdapter = new marvel.erickmaeda.com.marvelcharacters.ui.adapters.CharactersAdapter(characters, this);
    charactersAdapter.setOnClickListener(this);
    charactersAdapter.setOnLongClickListener(this);
    pbCharacters.setVisibility(View.GONE);
    recyclerView.setAdapter(charactersAdapter);
}