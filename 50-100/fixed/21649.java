@java.lang.Override
public void onCreate(net.sqlcipher.database.SQLiteDatabase database) {
    super.onCreate(database);
    createTable(database, org.ei.opensrp.path.repository.PathRepository.Table.client, org.ei.opensrp.path.repository.PathRepository.client_column.values());
    createTable(database, org.ei.opensrp.path.repository.PathRepository.Table.address, org.ei.opensrp.path.repository.PathRepository.address_column.values());
    createTable(database, org.ei.opensrp.path.repository.PathRepository.Table.event, org.ei.opensrp.path.repository.PathRepository.event_column.values());
    createTable(database, org.ei.opensrp.path.repository.PathRepository.Table.obs, org.ei.opensrp.path.repository.PathRepository.obs_column.values());
    org.ei.opensrp.path.repository.UniqueIdRepository.createTable(database);
    org.ei.opensrp.path.repository.WeightRepository.createTable(database);
    org.ei.opensrp.path.repository.VaccineRepository.createTable(database);
}