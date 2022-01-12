public void actionPerformed(java.awt.event.ActionEvent e) {
    placexor(1, 1, whichmark());
    if (debug)
        java.lang.System.out.println(("Paikka 1 1 " + (whichmark())));
    
    ChangeButton(buttonbb);
    buttonbb.setEnabled(false);
    viimeisinSiirto[1][1] = whichmark();
    (buttoncount)++;
}