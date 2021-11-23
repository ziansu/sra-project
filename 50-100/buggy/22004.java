public com.pct.domain.ProfessorPublication creatreNewProfessorPublication(com.pct.domain.PublicationCategory category, java.lang.String isbn, java.lang.String title, java.lang.String authors, java.lang.String publisher, java.lang.String pageRange, com.pct.domain.enums.PublicationType publicationType, java.lang.Integer quoted) {
    com.pct.domain.ProfessorPublication professorPublication = new com.pct.domain.ProfessorPublication(isbn, title, authors, publisher, pageRange, publicationType, quoted, category, this);
    category.addProfessorPublication(professorPublication);
    this.professorPublications.add(professorPublication);
    return professorPublication;
}