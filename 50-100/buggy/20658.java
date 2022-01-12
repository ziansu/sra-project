public void actionPerformed(java.awt.event.ActionEvent e) {
    placexor(2, 0, whichmark());
    if (debug)
        java.lang.System.out.println(("Paikka 2 0 " + (whichmark())));
    
    ChangeButton(buttonca);
    buttonca.setEnabled(false);
    viimeisinSiirto[2][0] = whichmark();
    (buttoncount)++;
}