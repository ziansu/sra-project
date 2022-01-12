public static void setStatsPanel(java.lang.String type) {
    frontEnd.StatisticsPanel panel3 = null;
    try {
        panel3 = new frontEnd.StatisticsPanel(new main.Tatai(), type);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    main.Tatai.cards.add(panel3.mainPanel, "STATS");
    java.awt.CardLayout cl = ((java.awt.CardLayout) (main.Tatai.cards.getLayout()));
    cl.show(main.Tatai.cards, "STATS");
}