public static void main(java.lang.String[] args) {
    javax.swing.JFrame frame = new javax.swing.JFrame("Sequence");
    SequenceGUI sequence = new SequenceGUI();
    SequenceGUI.SequenceFileEventHandler fileWriter = new SequenceGUI.SequenceFileEventHandler();
    sequence.setOpaque(true);
    frame.setContentPane(sequence);
    frame.addWindowListener(fileWriter);
    frame.pack();
    frame.setVisible(true);
}