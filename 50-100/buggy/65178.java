public void insertTransaksijualobat(java.lang.String idTransaksijual, java.lang.String dateTransaksijual, java.lang.String keterangan) throws java.rmi.RemoteException {
    carismainterface.entity.Transaksijualobat transaksijual = new carismainterface.entity.Transaksijualobat();
    transaksijual.setIdTransaksijual(idTransaksijual);
    transaksijual.setDateTransaksijual(dateTransaksijual);
    transaksijual.setKeterangan(keterangan);
    transaksijualobat.insertTransaksijualbat(transaksijual);
}