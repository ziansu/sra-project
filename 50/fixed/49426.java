public void heal(com.xoul.ru.magone.model.Heal heal) {
    if ((heal.heal) > 0)
        currenthp += heal.heal;
    
    if ((currenthp) > (MAXHP))
        currenthp = MAXHP;
    
}