@java.lang.Override
public void run() {
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        ui.CalculatorPanel panel = new ui.CalculatorPanel();
        panel.setPreferredSize(new java.awt.Dimension(450, 300));
        javax.swing.JFrame frame = new javax.swing.JFrame(message.Message.TITLE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}