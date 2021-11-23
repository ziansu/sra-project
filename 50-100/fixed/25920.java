private void setTitle() {
    de.westnordost.osmapi.map.data.OsmElement element = getOsmElement();
    java.lang.String name = ((element != null) && ((element.getTags()) != null)) ? element.getTags().get("name") : null;
    if ((name != null) && (!(name.trim().isEmpty()))) {
        setTitle(getResources().getString(R.string.quest_busStopShelter_name_title, name));
    }else {
        setTitle(R.string.quest_busStopShelter_title);
    }
}