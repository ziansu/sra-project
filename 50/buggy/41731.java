@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent aE) {
    java.lang.String lEingabe = fView.getEingabe();
    fView.SetErgebnis(java.lang.String.valueOf(fModel.Berechne(lEingabe)));
}