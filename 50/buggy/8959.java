public void addQualification() {
    if ((choosenQualifications) == null)
        choosenQualifications = new java.util.ArrayList<>();
    
    choosenQualifications.add(qualificationService.addQualification(school, degree));
}