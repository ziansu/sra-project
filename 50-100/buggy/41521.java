public static void main(java.lang.String[] args) {
    main.KabasujiMain.backMgr = new main.PanelBackManager();
    main.KabasujiMain.frame = new views.KabasujiFrame(main.KabasujiMain.backMgr);
    main.KabasujiMain.frame.setVisible(true);
    main.KabasujiMain.frame.setBounds(main.KabasujiMain.windowSize);
    main.KabasujiMain.frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    main.KabasujiMain.frame.setContentPane(new main.Title(main.KabasujiMain.frame));
    java.lang.System.out.println(("Working Directory = " + (java.lang.System.getProperty("user.dir"))));
}