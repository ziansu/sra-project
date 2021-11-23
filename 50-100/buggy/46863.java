public int getInsertPos(char x) {
    for (int i = 0; i < (friend_list.size()); i++) {
        if ((friend_list.get(i).charAt(0)) > x)
            return i;
        
    }
    return friend_list.size();
}