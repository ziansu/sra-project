@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("up");
    ((Jpanels.Editor) (childPanels.get(Jpanels.EditorPanel.EDITOR_INDEX))).keyPressed(java.awt.event.KeyEvent.VK_UP);
}