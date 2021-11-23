void reset(java.util.List<com.github.gfx.helium.model.EpitomeEntry> list) {
    list.clear();
    for (com.github.gfx.helium.model.EpitomeEntry entry : list) {
        if (entry.hasKnownScheme()) {
            addItem(entry);
        }
    }
    notifyDataSetChanged();
}