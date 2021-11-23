public boolean contains(Adventure.Items.Item item) {
    boolean result = false;
    for (Adventure.Items.Item i : inventory) {
        if (i.equals(item))
            result = true;
        
    }
    return result;
}