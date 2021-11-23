private void checkGameInput() {
    if (Gdx.input.isKeyJustPressed(Keys.B))
        debug = !(debug);
    
    if (Gdx.input.isKeyJustPressed(Keys.L))
        Lifesystem.hearts = de.woody.game.Lifesystem.changeHearts(((Lifesystem.hearts) - 1));
    
    if (Gdx.input.isKeyJustPressed(Keys.R)) {
        if ((de.woody.game.Lifesystem.getLife()) == 0)
            Lifesystem.life = de.woody.game.Lifesystem.setLife(3);
        else
            Lifesystem.life = de.woody.game.Lifesystem.setLife(2);
        
    }
}