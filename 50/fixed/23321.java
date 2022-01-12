public void alquilarItem() throws edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler {
    java.util.Date dt = new java.util.Date();
    sp.registrarAlquilerCliente(new java.sql.Date(dt.getTime()), clientId, sp.consultarItem(itemId), rentDays);
}