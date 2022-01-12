public spell.INode find(java.lang.String word) {
    spell.Node temp = root;
    for (int i = 0; i < (word.length()); i++) {
        int index = indexByLetter(word.charAt(i));
        if (temp.hasNode(index)) {
            temp = temp.getNode(index);
        }else {
            return null;
        }
    }
    return temp;
}