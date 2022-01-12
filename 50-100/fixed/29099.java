public void render() {
    main.image(img, pos.x, pos.y, plWidth, (-(plHeight)));
    if (((pos.y) - (getHeight())) > (main.height)) {
        pos = spawnPos;
        (lives)--;
    }
}