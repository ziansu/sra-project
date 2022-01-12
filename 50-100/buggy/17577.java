public static jp.hichain.prototype.basic.CompleteBS get(int _player, char _ch) {
    for (jp.hichain.prototype.basic.CompleteBS bs : jp.hichain.prototype.ui.SignData.signs) {
        if (((bs.getPlayer()) == _player) && ((bs.getChar()) == _ch)) {
            return bs;
        }
    }
    return jp.hichain.prototype.ui.SignData.signs.get(' ');
}