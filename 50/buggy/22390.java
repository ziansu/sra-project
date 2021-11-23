public void addCard(int _monster_id, int _card_id) {
    if (_monster_id == (first_monster_id))
        first_monster_cards.add(Card.find(_card_id));
    else
        second_monster_cards.add(Card.find(_card_id));
    
}