public Item deleteItem(int i) {
    if (i == 0) {
        return get(0);
    }else
        return items.remove(i);
    
}