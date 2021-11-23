void updateBackground() {
    if ((_offset_back) > (_tileHeight))
        _offset_back = (_offset_back) - (_tileHeight);
    else
        _offset_back = (_offset_back) + ((_dy_back) * (Gdx.graphics.getDeltaTime()));
    
    for (int i = 0; i < 9; i++) {
        _y_back[i] = ((_tileHeight) * i) - (_offset_back);
    }
}