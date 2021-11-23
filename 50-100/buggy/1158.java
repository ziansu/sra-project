private int findUserFromName(java.lang.String chatId, java.lang.String name) {
    int index = 9999;
    for (int i = 0; i < (users.get(java.lang.Integer.parseInt(chatId)).size()); i++) {
        if (users.get(java.lang.Integer.parseInt(chatId)).get(i).getName().equals(name))
            index = i;
        
    }
    return index;
}