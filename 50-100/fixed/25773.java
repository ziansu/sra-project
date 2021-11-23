@java.lang.Override
public void reloadTablePasien() {
    java.util.List<com.dbsys.rs.lib.entity.Pasien> list = null;
    try {
        list = loadPasienPerawatan();
    } catch (com.dbsys.rs.connector.ServiceException ex) {
        tblPasien.setModel(new com.dbsys.rs.client.tableModel.PasienTableModel(list));
    } finally {
        loadDetailRuangan(list);
        pasien = null;
        cbPasienKelas.setSelectedIndex(0);
        cbPasienPenanggung.setSelectedIndex(0);
    }
}