@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        customer = q.getCustomer(customer.getCid(), customer.getPhone());
    } catch (java.lang.Exception err) {
        java.lang.System.out.println("Error while updating");
        err.printStackTrace();
    }
    produceCustomerFrame();
    frame.setVisible(false);
    frame.dispose();
}