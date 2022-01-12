public void mousePressed() {
    for (cn.edu.zufe.drawable.PWell pw : pwList) {
        pw.setClicked(false);
    }
    if ((mouseButton) == (LEFT)) {
        for (cn.edu.zufe.drawable.PWell pw : pwList) {
            if (pw.collisionDetection(mouseX, mouseY)) {
                pw.setClicked(true);
                break;
            }
        }
    }
    drawPGBottom();
}