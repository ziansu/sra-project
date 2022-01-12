private int getHiddenCountUpTo(int location) {
    int count = 0;
    for (int i = 0; i <= location; i++) {
        if (hidden.contains(users.get(i).getName()))
            count++;
        
    }
    return count;
}