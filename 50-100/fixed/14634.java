public void run() {
    MyFrame frame = new MyFrame();
    frame.setTitle("plang");
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setResizable(true);
    frame.setVisible(true);
    KnowledgeBase knowledgeBase = new KnowledgeBase("sources.txt");
}