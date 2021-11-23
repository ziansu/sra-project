@java.lang.Override
public void run() {
    frame.table.clear();
    java.lang.Integer amt = table.getBetAmt();
    if (amt <= 0) {
        javax.swing.JOptionPane.showMessageDialog(frame, "Minimum bet is $5.", "Status", javax.swing.JOptionPane.ERROR_MESSAGE);
        return ;
    }
    enableDeal(false);
    frame.table.shuffle();
    java.lang.Integer sideAmt = table.getSideAmt();
    charlie.card.Hid hid = courier.bet(amt, sideAmt);
    hids.add(hid);
    hands.put(hid, new charlie.card.Hand(hid));
}