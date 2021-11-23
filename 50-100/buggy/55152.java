public void mouseClicked(java.awt.event.MouseEvent e) {
    if (net.drawnum.scanner.hasNextLine()) {
        java.lang.String temp = net.drawnum.scanner.nextLine();
        java.lang.String[] lst = net.drawnum.scanner.nextLine().split(",");
        for (int a = 0; a < 784; a++) {
            net.drawnum.doublst[a] = java.lang.Integer.parseInt(lst[(a + 1)]);
        }
        window.repaint();
    }
}