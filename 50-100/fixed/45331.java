public void removeCharacter(int id) {
    for (int i = 0; i < (characters.size()); i++) {
        if ((characters.get(i).getId()) == id) {
            characters.remove(i);
        }
    }
}