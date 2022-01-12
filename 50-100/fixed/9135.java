public void actionPerformed(java.awt.event.ActionEvent e) {
    if (debug)
        java.lang.System.out.println(("Paikka 1 2 " + (whichmark())));
    
    ChangeButton(buttonbc);
    buttonbc.setEnabled(false);
    viimeisinSiirto[1][2] = whichmark();
    (buttoncount)++;
}