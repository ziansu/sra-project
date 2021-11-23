public void contact(java.lang.Character character) {
    for (Model.Map.Location key : takableItems.keySet()) {
        if (key.equals(character.getLocation())) {
            takableItems.get(key).onInteract(character);
            mapItemViews.remove(takableItems.get(key));
            takableItems.remove(key);
            alert();
        }
    }
}