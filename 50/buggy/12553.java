public void LoadContent() {
    java.net.URL pokemonBodyImgUrl = this.getClass().getResource("ressource/img/charizard.png");
    try {
        pokemonBodyImg = javax.imageio.ImageIO.read(pokemonBodyImgUrl);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}