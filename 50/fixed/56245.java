public static void main(java.lang.String[] args) {
    src.Test t = new src.Test();
    src.StatsView test = new src.StatsView(null);
    test.setVisible(true);
    t.setContentPane(test);
    t.setVisible(true);
}