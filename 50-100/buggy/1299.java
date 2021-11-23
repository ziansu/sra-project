public boolean spellInHand(Parser p) {
    DBCard c = null;
    for (int i = 0; i < 11; i++) {
        if ((p.myHand[i]) != null) {
            try {
                c = cDB.cards.get(p.myHand[i].name);
            } catch (java.lang.Exception e) {
                continue;
            }
            if (c != null)
                if ((c.spell) == 1)
                    return true;
                
            
        }
    }
    return false;
}