public void beAttacked(int damage) {
    if (((java.lang.System.currentTimeMillis()) - (_last_revive_time)) < 3000L)
        return ;
    
    int _damage = damage - (defense);
    if (_damage < 0)
        _damage = 0;
    
    changeHealth((-_damage));
    changeScore((-damage));
}