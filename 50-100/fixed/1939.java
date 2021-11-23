public static void main(java.lang.String[] args) {
    AppSeizaUranai_EF ef = new AppSeizaUranai_EF();
    java.lang.System.out.println("～～～～～～今日の占い～～～～～～");
    java.lang.System.out.println("");
    for (int i = 0; i < 10; i++) {
        AppSeizaUranai_EF.randomfortune(ef.rankArray.get(i), (i + 1));
    }
    java.lang.System.out.println("～～～～～～良い一日を！～～～～～～");
}