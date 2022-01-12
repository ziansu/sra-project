private void addItem(simple.musicgenie.BaseSong song, java.lang.String section) {
    if (section.equals("")) {
        int index = songs.size();
        songs.add(song);
        typeViewList.add(new simple.musicgenie.ViewTypeModel(simple.musicgenie.ResulstsRecyclerAdapter.TYPE_SONG, " ", index));
    }else {
        simple.musicgenie.L.m("Result Adapter", (" TypeViewList Addition ->" + section));
        typeViewList.add(new simple.musicgenie.ViewTypeModel(simple.musicgenie.ResulstsRecyclerAdapter.TYPE_SECTION_TITLE, section, (-1)));
    }
}