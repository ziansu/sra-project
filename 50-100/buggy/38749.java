@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        javax.swing.JComponent comp = new edu.cmu.tetradapp.app.hpc.editor.HpcJobActivityEditor();
        javax.swing.JOptionPane.showMessageDialog(edu.cmu.tetrad.util.JOptionUtils.centeringComp(), comp, edu.cmu.tetradapp.app.hpc.action.HpcJobActivityAction.TITLE, javax.swing.JOptionPane.PLAIN_MESSAGE);
    } catch (java.awt.HeadlessException e1) {
        e1.printStackTrace();
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
}