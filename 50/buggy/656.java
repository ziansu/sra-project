public static void loseBet(int bet) {
    Money.money = (Money.money) - bet;
    java.lang.System.out.print(("Money:$" + (Money.money)));
}