public void deductNetwork(java.lang.Character ch) {
    int ch_order = characterAdded.indexOf(ch);
    characterAdded.get(((characterAdded.size()) - 1)).net_index = ch.net_index;
    characterAdded.set(ch_order, characterAdded.get(((characterAdded.size()) - 1)));
    characterAdded.remove(characterAdded.get(((characterAdded.size()) - 1)));
    (net_num)--;
}