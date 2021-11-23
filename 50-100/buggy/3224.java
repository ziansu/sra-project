public void put() {
    shouldUpdateStack();
    shouldUpdateTa();
    int y = _ps.pop();
    int x = _ps.pop();
    int v = _ps.pop();
    if ((((x > (_pa._xSize)) || (y > (_pa._ySize))) || (x < 0)) || (y < 0)) {
    }else {
        _pa.setOpCode(x, y, ((char) (v)));
    }
}