public void make(jp.hichain.prototype.basic.Player _player, jp.hichain.prototype.basic.ChainSign _sign) {
    player = _player;
    chainSign = _sign;
    position.searchChainsAll();
    position.createAroundsAll();
    move = new jp.hichain.prototype.basic.Move(this);
}