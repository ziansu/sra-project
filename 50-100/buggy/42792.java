@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    modelSeat.removeAllElements();
    arrSeat = ac.getSeatFromAircraft(comboFlight.getSelectedItem().toString(), comboCabin.getSelectedItem().toString());
    for (java.lang.String item : arrSeat) {
        modelSeat.addElement(item);
    }
    comboSeat.revalidate();
}