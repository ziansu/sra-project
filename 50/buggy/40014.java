public int gainHP(int hp) {
    if (((_health) + hp) > (_maxhealth)) {
        _health = _maxhealth;
    }else {
        _health += hp;
    }
}