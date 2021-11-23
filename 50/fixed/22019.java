public Item deleteItem(int i) {
    if (i == 0) {
        return items.get(0);
    }else
        return items.remove(i);
    
}