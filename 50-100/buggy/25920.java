private void setTitle() {
    de.westnordost.osmapi.map.data.OsmElement element = getOsmElement();
    if ((element != null) && ((element.getTags()) != null)) {
        java.lang.String name = element.getTags().get("name");
        setTitle(getResources().getString(R.string.quest_busStopShelter_name_title, name));
    }else {
        setTitle(R.string.quest_busStopShelter_title);
    }
}