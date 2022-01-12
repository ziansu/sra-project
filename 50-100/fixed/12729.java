public void actionPerformed(java.awt.event.ActionEvent e) {
    if (debug)
        java.lang.System.out.println(("Paikka 1 0 " + (whichmark())));
    
    ChangeButton(buttonba);
    buttonba.setEnabled(false);
    viimeisinSiirto[1][0] = whichmark();
    (buttoncount)++;
}