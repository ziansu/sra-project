public void actionPerformed(java.awt.event.ActionEvent e) {
    placexor(0, 1, whichmark());
    if (debug)
        java.lang.System.out.println(("Paikka 0 1 " + (whichmark())));
    
    ChangeButton(buttonab);
    buttonab.setEnabled(false);
    viimeisinSiirto[0][1] = whichmark();
    (buttoncount)++;
}