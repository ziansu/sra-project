public void heal(com.xoul.ru.magone.model.Heal heal) {
    currenthp += heal.heal;
    if ((currenthp) > (MAXHP))
        currenthp = MAXHP;
    
}