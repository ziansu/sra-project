public java.util.List<com.syvenko.model.Faculty> getAll(com.syvenko.model.Faculty faculty) {
    return ((java.util.List<com.syvenko.model.Faculty>) (facultyRepository.findAll()));
}