public static void main(final java.lang.String... args) {
    com.shurikat.cooperationgame.project.Tournament.Settings settings = new com.shurikat.cooperationgame.project.Tournament.Settings(1000, 100, 20, 1000);
    com.shurikat.cooperationgame.project.Statistic statistic = new com.shurikat.cooperationgame.project.Tournament(settings).run();
    com.shurikat.cooperationgame.project.Main.print(statistic);
}