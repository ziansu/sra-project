public void castASpell() {
    com.xoul.ru.magone.model.spells.Spell sp = currentPlayer.createSpell(currentPlayer, getEnemy());
    if (sp != null) {
        if ((currentPlayer.getMp()) >= (sp.manaAmountToCut))
            currentPlayer.setSpell(sp);
        
        currentPlayer.clearCurrenSpell();
        getEnemy().clearEffects();
        notifyObserver();
    }
}