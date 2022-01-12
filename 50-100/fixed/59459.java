public void deductNetwork(java.lang.Character ch) {
    if ((characterAdded.indexOf(ch)) != (-1)) {
        characterAdded.get(((net_num) - 1)).net_index = ch.net_index;
        characterAdded.set(ch.net_index, characterAdded.get(((net_num) - 1)));
        ch.net_index = -1;
        characterAdded.remove(((net_num) - 1));
        (net_num)--;
    }
}