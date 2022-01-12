public int getPoigneeBonus() {
    int pts = 0;
    for (com.sbgapps.scoreit.core.model.tarot.TarotBonus bonus : getBonuses()) {
        switch (bonus.get()) {
            case TarotBonus.BONUS_POIGNEE_SIMPLE :
                pts += 20;
            case TarotBonus.BONUS_POIGNEE_DOUBLE :
                pts += 30;
            case TarotBonus.BONUS_POIGNEE_TRIPLE :
                pts += 40;
        }
    }
    return pts;
}