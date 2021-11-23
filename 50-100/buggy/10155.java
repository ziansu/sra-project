private long _daysLate(com.born2go.lazzybee.db.Card card) {
    long due;
    long now = com.born2go.lazzybee.algorithms.Utils.intNow();
    if ((card.getQueue()) == (com.born2go.lazzybee.db.Card.QUEUE_REV2))
        due = card.getDue();
    else
        due = now;
    
    long diff_day = (now - due) / (com.born2go.lazzybee.algorithms.CardSched.SECONDS_PERDAY);
    return java.lang.Math.max(0, diff_day);
}