public static void main(java.lang.String[] args) {
    com.jessie.GuessNumberGame.print("一起来玩儿猜数字游戏吧！");
    com.jessie.GuessNumberGame.print("你有6次机会!每次输入四个(0-9)数字");
    com.jessie.GuessNumberGame.print("预备，开始！");
    java.lang.String answer = com.jessie.GuessNumberGame.generateAnswer();
    java.lang.String inputNumber = com.jessie.GuessNumberGame.input();
    boolean isSuccess = com.jessie.GuessNumberGame.runGame(answer, inputNumber);
    com.jessie.GuessNumberGame.printResult(isSuccess);
}