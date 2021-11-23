public void AddMoney() {
    if ((_currentMoney) < (_maxMoney)) {
        _currentMoney += SPEED;
    }
    if ((_currentMoney) > (_maxMoney)) {
        _currentMoney = _maxMoney;
    }
}