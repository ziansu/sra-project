public boolean addEvent(octu.core.Event evt) {
    for (int i = 0; i < (events.size()); i++) {
        if (events.get(i).getName().equals(evt.getName())) {
            return false;
        }
    }
    events.add(evt);
    return true;
}