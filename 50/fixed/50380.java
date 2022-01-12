public static void betting(int bet) {
    Money.money = (Money.money) - bet;
    Money.money = (Money.money) + (bet * 2);
    java.lang.System.out.println(("Money:$" + (Money.money)));
}