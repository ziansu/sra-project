private java.lang.Boolean validateTheoryTotal(java.lang.Boolean error, org.ums.domain.model.dto.StudentGradeDto gradeDTO) {
    if (((gradeDTO.getTotal()) > 100) || ((gradeDTO.getTotal()) != (java.lang.Math.round(((((gradeDTO.getQuiz()) + (gradeDTO.getClassPerformance())) + (gradeDTO.getPartA())) + (gradeDTO.getPartB())))))) {
        error = java.lang.Boolean.TRUE;
    }
    return error;
}