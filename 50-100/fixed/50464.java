public void actionPerformed(java.awt.event.ActionEvent e) {
    if (debug)
        java.lang.System.out.println(("Paikka 0 2 " + (whichmark())));
    
    ChangeButton(buttonac);
    buttonac.setEnabled(false);
    viimeisinSiirto[0][2] = whichmark();
    (buttoncount)++;
}