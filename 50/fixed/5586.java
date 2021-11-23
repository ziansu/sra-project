public static jp.hichain.prototype.basic.Square get(int _v, int _h) {
    jp.hichain.prototype.basic.Position pos = jp.hichain.prototype.basic.Position.get(_v, _h);
    if (pos == null)
        return null;
    
    return pos.getSquare();
}