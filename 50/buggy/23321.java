public void alquilarItem() throws edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler {
    java.util.Date dt = new java.util.Date();
    sp.registrarAlquilerCliente(((java.sql.Date) (dt)), clientId, sp.consultarItem(itemId), rentDays);
}