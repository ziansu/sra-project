public void setupGUI() {
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    setVisible(true);
    setTitle(PRG_NAME);
    mainWindow.setLayout(new java.awt.BorderLayout());
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    calculate = new matrix.util.BasicOperation();
    setupStateListener();
    setupMainBar();
    setupWorkArea();
    setupCalcButtons();
    setupBasicOperations();
    setupTools();
    registerListeners();
    setupLower();
    setupFeedback();
    updateFeedback(FDB_READY);
    setupExpression();
}