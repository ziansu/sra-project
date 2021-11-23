public dsn.replication.global_partition_id get_gpid(java.lang.String key) {
    dsn.replication.global_partition_id result = new dsn.replication.global_partition_id(app_id_, (-1));
    result.pidx = ((int) ((hasher_.hash(key)) % (clients_.length)));
    return result;
}