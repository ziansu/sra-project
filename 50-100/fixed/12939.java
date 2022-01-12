protected net.instant.util.fileprod.ProducerJob produceInner(java.lang.String name) {
    net.instant.util.fileprod.ProducerJob ret = null;
    if ((fs) != null)
        ret = fs.produce(name);
    
    if (((rs) != null) && (ret == null))
        ret = rs.produce(name);
    
    return ret;
}