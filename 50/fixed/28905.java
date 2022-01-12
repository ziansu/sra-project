public java.util.List<org.egov.wtms.masters.entity.ConnectionCategory> findAll() {
    return connectionCategoryRepository.findAll(new org.springframework.data.domain.Sort(Sort.Direction.DESC, "name"));
}