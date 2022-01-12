public static void main(java.lang.String[] args) {
    main.KabuildsujiMain.backMgr = new main.PanelBackManager();
    main.KabuildsujiMain.frame = new views.KabasujiFrame(main.KabuildsujiMain.backMgr);
    main.KabuildsujiMain.frame.setContentPane(new main.BuilderTitle(main.KabuildsujiMain.frame));
    main.KabuildsujiMain.frame.setVisible(true);
    main.KabuildsujiMain.frame.setBounds(main.KabuildsujiMain.windowSize);
    main.KabuildsujiMain.frame.setDefaultCloseOperation(KabasujiFrame.EXIT_ON_CLOSE);
}