public void punch(java.lang.Character character, float delta) {
    com.saints.gamecode.gameobjects.GameObject attack = character.getStraightAttack();
    if (character.isP1()) {
        p1AttackTime += delta;
        drawPunch(attack, p1AttackTime);
    }else
        if (!(character.isP1())) {
            p2AttackTime += delta;
            drawPunch(attack, p2AttackTime);
        }
    
}