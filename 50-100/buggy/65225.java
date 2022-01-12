updateBackground() {
    if ((_offset_back) > (_tileHeight))
        offset_back = (_offset_back) - (tileHeight);
    else
        _offset_back = (offset_back) + ((_dy_back) * (Gdx.graphics.getDeltaTime()));
    
    for (int i = 0; i < 9; i++) {
        _y_back[i] = ((tileHeight) * i) - (_offset_back);
    }
}