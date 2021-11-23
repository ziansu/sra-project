public void actionPerformed(java.awt.event.ActionEvent e) {
    placexor(0, 0, whichmark());
    if (debug)
        java.lang.System.out.println(("Paikka 0 0 " + (whichmark())));
    
    ChangeButton(buttonaa);
    buttonaa.setEnabled(false);
    viimeisinSiirto[0][0] = whichmark();
    (buttoncount)++;
}