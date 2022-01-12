public int giveNextScreen() {
    if (Gdx.input.isKeyJustPressed(Keys.S)) {
        page = shop;
    }else
        if (Gdx.input.isKeyJustPressed(Keys.C)) {
            page = controls;
        }else
            if (Gdx.input.isKeyJustPressed(Keys.TAB)) {
                page = credits;
            }
        
    
    return page;
}