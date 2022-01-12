private void initialize() {
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    setBounds(500, 200, 640, 480);
    contentPane = new javax.swing.JPanel();
    contentPane.addMouseListener(new playerControllers.PlayerOutsideGridController(this));
    contentPane.setBackground(java.awt.Color.DARK_GRAY);
    contentPane.setForeground(java.awt.Color.DARK_GRAY);
    contentPane.setBorder(new javax.swing.border.EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    showComponents();
}