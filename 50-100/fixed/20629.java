private void removeChildren(digital_table.elements.Group parent) {
    for (int i = (model.getSize()) - 1; i >= 0; i--) {
        digital_table.elements.MapElement el = model.get(i);
        if ((el.getParent()) == parent) {
            if (el instanceof digital_table.elements.Group)
                removeChildren(((digital_table.elements.Group) (el)));
            
            parent.removeChild(el);
            model.removeElement(el);
        }
    }
}