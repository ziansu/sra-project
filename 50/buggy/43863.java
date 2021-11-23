public void Attacked(int damage) {
    _currentHeath -= damage;
    if (((_currentHeath) - damage) <= 0) {
        Died();
    }
    SetIsAttacked(true);
}