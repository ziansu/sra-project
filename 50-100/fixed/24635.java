public java.util.List<com.ifalot.tripzor.model.Trip> getSelected() {
    java.util.List<com.ifalot.tripzor.model.Trip> selected = new java.util.LinkedList<com.ifalot.tripzor.model.Trip>();
    for (int i = 0; i < (trips.size()); i++) {
        if (checked[i])
            selected.add(trips.get(i));
        
    }
    return selected;
}