@java.lang.Override
public int getRowCount() {
    return (it.unisalento.BookLandia.dao.VenditaDAO.getInstance().getNumeroVendite()) - 1;
}