public void contact(java.lang.Character character) {
    Model.Map.Location temp = null;
    for (Model.Map.Location key : takableItems.keySet()) {
        if (key.equals(character.getLocation())) {
            takableItems.get(key).onInteract(character);
            mapItemViews.remove(takableItems.get(key));
            temp = key;
            alert();
        }
    }
    if (temp != null) {
        takableItems.remove(temp);
    }
}