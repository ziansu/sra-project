public void removeHdfsUser(io.hops.hopsworks.common.dao.hdfsUser.HdfsUsers user) {
    if (user == null) {
        return ;
    }
    io.hops.hopsworks.common.dao.hdfsUser.HdfsUsers u = em.find(io.hops.hopsworks.common.dao.hdfsUser.HdfsUsers.class, user.getId());
    if (u != null) {
        em.remove(u);
    }
}