@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("timer");
    if (hasDropped) {
        newPiece();
    }else {
        oneLineDown();
    }
}