public void actionPerformed(java.awt.event.ActionEvent e) {
    CleanScr();
    while (true) {
        if ((cpu.executeNext()) == (-1)) {
            break;
        }
    } 
    ShowData();
}