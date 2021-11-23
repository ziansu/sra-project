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
        
    
    int temp = page;
    page = title;
    return page;
}