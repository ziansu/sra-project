@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    double payingMoney = Shop.instance.payEmployee();
    if (payingMoney == 0) {
        javax.swing.JOptionPane.showMessageDialog(getRootPane(), "Today is not pay-day.");
    }else {
        javax.swing.JOptionPane.showMessageDialog(getRootPane(), (("Paid " + payingMoney) + " for employees"));
    }
}