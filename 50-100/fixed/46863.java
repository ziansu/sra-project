public int getInsertPos(char x) {
    if ((friend_list.size()) > 0) {
        for (int i = 0; i < (friend_list.size()); i++) {
            if ((friend_list.get(i).charAt(0)) > x)
                return i;
            
        }
    }
    return friend_list.size();
}