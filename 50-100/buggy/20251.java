public static void run() {
    java.lang.System.out.println(("New password: " + (puzzles.Day11.input)));
    while (!(puzzles.Day11.validate(puzzles.Day11.input))) {
        puzzles.Day11.input = puzzles.Day11.shift(puzzles.Day11.input);
    } 
    java.lang.System.out.println(("New password: " + (puzzles.Day11.input)));
}