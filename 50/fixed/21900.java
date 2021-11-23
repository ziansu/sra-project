public boolean add(Adventure.Items.Item... items) {
    boolean result = true;
    for (Adventure.Items.Item i : items) {
        if (!(add(1, i)))
            result = false;
        
    }
    return result;
}