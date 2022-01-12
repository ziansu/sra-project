private void initializeUiComponents() {
    tabPane = new javax.swing.JTabbedPane();
    tabPane.setTabLayoutPolicy(javax.swing.JTabbedPane.WRAP_TAB_LAYOUT);
    tabPane.addTab("intro", createPanel("GUI Component Gallery"));
    tabPane.addTab("frets", new com.nineworldsdeep.vMuse.gui.frets.FretBoardPanel(false));
    tabPane.addTab("keys", new com.nineworldsdeep.vMuse.gui.keys.KeyBoardPanel());
    tabPane.addTab("rhythms", new com.nineworldsdeep.vMuse.gui.rhythms.RhythmBoardPanel());
    tabPane.addTab("sequences", new com.nineworldsdeep.vMuse.gui.sequences.SequenceBoardPanel());
}