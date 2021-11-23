private void loadSenseRelations() {
    if (loaded) {
        return ;
    }
    loaded = true;
    pl.edu.pwr.wordnetloom.client.systems.managers.lRelationTypeManager.all_rels.clear();
    pl.edu.pwr.wordnetloom.client.systems.managers.lRelationTypeManager.top_child.clear();
}