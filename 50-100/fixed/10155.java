protected long _daysLate(com.born2go.lazzybee.db.Card card) {
    if ((card.getQueue()) != (com.born2go.lazzybee.db.Card.QUEUE_REV2))
        return 0;
    
    long due = card.getDue();
    long now = com.born2go.lazzybee.algorithms.Utils.intNow();
    long diff_day = (now - due) / (com.born2go.lazzybee.algorithms.CardSched.SECONDS_PERDAY);
    return java.lang.Math.max(0, diff_day);
}