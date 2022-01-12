@java.lang.Override
public void keyTyped(java.awt.event.KeyEvent e) {
    switch (e.getKeyChar()) {
        case 'w' :
            moveCamera(0.25F, zAxis);
            break;
        case 's' :
            moveCamera((-0.25F), zAxis);
            break;
        case 'a' :
            moveCamera((-0.025F), xAxis);
            break;
        case 'd' :
            moveCamera(0.025F, xAxis);
            break;
        case 'q' :
            rotateAroundZAxis(0.025F);
            break;
        case 'e' :
            rotateAroundZAxis((-0.025F));
            break;
    }
}