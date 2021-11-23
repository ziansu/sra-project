@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    switch (e.getButton()) {
        case 1 :
            {
                btns[1] = false;
                break;
            }
        case 2 :
            {
                btns[2] = false;
                break;
            }
        case 3 :
            {
                btns[3] = false;
                break;
            }
    }
}