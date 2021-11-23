void init() {
    player[0] = new com.school.zephania.ccdgame.model.Player();
    player[1] = new com.school.zephania.ccdgame.model.Player();
    player[2] = new com.school.zephania.ccdgame.model.Player();
    player[3] = new com.school.zephania.ccdgame.model.Player();
    for (int i = 0; i < 52; i++)
        cards.add(new com.school.zephania.ccdgame.model.Card());
    
    viewInit();
    player[1].setHandCards(cards.subList(0, 12));
}