@java.lang.Override
public void run() {
    while (true) {
        if (((java.lang.System.currentTimeMillis()) - (lastAction)) > 500) {
            if (playerAdjacentTo(_x, _y)) {
                _player.reduceHealth(monsters.get(this).attack());
                if (_player.isDead()) {
                    _gui.gameOver();
                }
            }
            _gui.refreshMenu();
            lastAction = java.lang.System.currentTimeMillis();
        }
    } 
}