public java.util.List<ma.kamal.domain.Child> findChildren(java.lang.String matricule) {
    return employeeRepository.findOne(java.lang.Long.parseLong(matricule)).getChildren();
}