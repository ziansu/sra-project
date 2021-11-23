private void init() {
    sound = new com.it.main.Sound();
    imageLoader = new com.it.main.BufferedImageLoader();
    handler = new com.it.main.GameObjectHandler();
    this.addKeyListener(new com.it.main.KeyInput(handler));
    menu = new com.it.main.Menu(imageLoader, this, sound);
    this.addMouseListener(new com.it.main.MouseInput(menu));
    com.it.main.LevelLoader levelLoader = new com.it.main.LevelLoader(imageLoader, handler);
    camera = levelLoader.loadLevel("jaime", 1);
    background = new com.it.main.Background(BackgroundType.Day, imageLoader);
}