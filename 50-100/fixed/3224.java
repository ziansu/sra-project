public void put() {
    shouldUpdateStack();
    shouldUpdateTa();
    int x = _ps.pop();
    int y = _ps.pop();
    int v = _ps.pop();
    if ((((x > (_pa._xSize)) || (y > (_pa._ySize))) || (x < 0)) || (y < 0)) {
    }else {
        _pa.setOpCode(x, y, ((char) (v)));
    }
}