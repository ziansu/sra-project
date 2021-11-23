@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    search.setVisible(false);
    recommend.setVisible(true);
    try {
        performRecommend();
    } catch (javax.swing.text.BadLocationException e1) {
    }
    miniYelp.setVisible(true);
}