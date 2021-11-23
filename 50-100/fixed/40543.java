private int getCheckedItem() {
    int id = 0;
    if ((itemsSelected.size()) > 0) {
        for (int i = 0; i < (items.size()); i++)
            if ((items.get(i).id) == (itemsSelected.get(0).id))
                id = i;
            
        
    }
    return id;
}