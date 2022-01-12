public void Attacked(int damage) {
    _currentHeath -= damage;
    if (((_currentHeath) - damage) <= 0) {
        KnockedBack();
        Died();
    }else
        if (((_currentHeath) > ((_health) / 2)) && (((_health) / 2) > ((_currentHeath) - damage))) {
            KnockedBack();
        }
    
}