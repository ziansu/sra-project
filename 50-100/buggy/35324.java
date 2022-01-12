@java.lang.Override
public void addRendels(model.Rendeles rendeles) throws java.sql.SQLException {
    addRendelesStem.setInt(1, rendeles.getOsszeg());
    addRendelesStem.setInt(2, rendeles.getDarabszam());
    addRendelesStem.setInt(3, rendeles.getRendeloId());
    addRendelesStem.setBoolean(4, rendeles.isTeljesitve());
    addRendelesStem.executeUpdate();
}