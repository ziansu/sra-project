public static void Run() {
    GamePlay.CreateWorld();
    GamePlay.Intro();
    User Bob = new User();
    GamePlay.play(Bob);
}