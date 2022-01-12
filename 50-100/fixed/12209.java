public static at.ezylot.IncrementalBallGame.MovableCircle createMovableCircle(double x, double y, double radius) {
    java.lang.String[] colors = new java.lang.String[]{ "green" , "blue" , "orange" , "grey" , "brown" };
    java.lang.String color = colors[new java.util.Random().nextInt(colors.length)];
    return new at.ezylot.IncrementalBallGame.MovableCircle(x, y, radius, javafx.scene.paint.Paint.valueOf(color), new java.util.Random().nextInt(359), Main.RootStage);
}