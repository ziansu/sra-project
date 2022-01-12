@javax.transaction.Transactional
public void updateUsers(java.lang.String location, java.lang.String country, int users) {
    if ((locationDetailRepo.findByLocation(location).size()) > 0)
        locationDetailRepo.updateUsers(location, users);
    else {
        po.AreaDetail detail = new po.AreaDetail(location, country, users);
        locationDetailRepo.save(detail);
    }
}