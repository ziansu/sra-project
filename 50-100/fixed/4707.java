private void removeCardFromList(java.util.ArrayList<model.database.Card> list, model.database.Card chosenCard) {
    for (int i = 0; i < (list.size()); i++) {
        if ((list.get(i).getGameID()) == (chosenCard.getGameID())) {
            list.remove(i);
            return ;
        }
    }
}