private void addDeveloperFromInput() {
    int id = readIdFromInput();
    com.homelearning.model.Developer developer = developerController.getById(id);
    if (developer == null) {
        developerController.save(new com.homelearning.model.Developer(readIdFromInput(), readFirstNameFromInput(), readLastNameFromInput(), readSpecialtyFromInput(), readExperienceFromInput(), readSalaryFromInput()));
    }else {
        java.lang.System.out.printf("Developer with id %d already exists:\n", id);
        java.lang.System.out.println(developer);
    }
}