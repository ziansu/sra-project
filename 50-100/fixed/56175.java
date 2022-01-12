public java.util.List<kr.ac.yonsei.fyea.domain.Student> getStudents(kr.ac.yonsei.fyea.web.model.StatsQueryModel queryModel) {
    java.util.List<java.lang.String> idStartsWith = queryModel.getIdStartsWith();
    if ((idStartsWith == null) || (idStartsWith.isEmpty())) {
        return studentRepository.findAll();
    }
    return idStartsWith.stream().map(studentRepository::findByIdStartsWith).flatMap(java.util.List::stream).distinct().collect(java.util.stream.Collectors.toList());
}