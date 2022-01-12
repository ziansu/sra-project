public void render() {
    main.image(img, pos.x, pos.y, plWidth, (-(plHeight)));
    addGravity(this);
    if (((pos.y) - (getHeight())) > (main.height)) {
        pos = spawnPos;
        (lives)--;
    }
}