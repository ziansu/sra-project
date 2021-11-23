public java.lang.String keepName() {
    pc.setLevel(java.lang.Integer.parseInt(dice.rollDice(1, 10)));
    hpInitializer.changeHP(pc, 0);
    players.addCharacter(pc);
    conversation.end();
    return "index";
}