@java.lang.Override
public void endPayment(int payback) {
    com.example.michael.kassenautomat_dhbw.util.Util.giveNickelback(payback, kassenautomatContext);
    if (fragmentAutomat.getTicketToPay().isPaid()) {
        com.example.michael.kassenautomat_dhbw.datatypes.Quittung quittung;
        try {
            quittung = fragmentAutomat.getTicketToPay().takeQuittung(kassenautomatContext.getDatabaseConnection());
        } catch (com.example.michael.kassenautomat_dhbw.exceptions.DbException e) {
            e.printStackTrace();
        }
    }
    returnToTicketList();
    fragmentAutomat.setTicketToPay(null);
}