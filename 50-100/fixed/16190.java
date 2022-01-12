public static void main(java.lang.String[] args) {
    java.lang.String answer = com.jessie.GuessNumberGame.generateAnswer();
    com.jessie.GuessNumberGame.print("一起来玩儿猜数字游戏吧！");
    com.jessie.GuessNumberGame.print("你有6次机会!每次输入四个(0-9)数字");
    com.jessie.GuessNumberGame.print("预备，开始！");
    boolean isSuccess = com.jessie.GuessNumberGame.runGame(answer);
    com.jessie.GuessNumberGame.printResult(isSuccess);
}