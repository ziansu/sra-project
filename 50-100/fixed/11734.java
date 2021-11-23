public static void getApplication() {
    git_aptra.SearchApplicant.DialogSearchApplicantApplication.educationalAchievement = java.lang.String.valueOf(git_aptra.SearchApplicant.DialogSearchApplicantApplication.boxEducationalAchievement.getSelectedItem());
    if (git_aptra.SearchApplicant.DialogSearchApplicantApplication.educationalAchievement.equals("Bitte ausw�hlen")) {
        git_aptra.SearchApplicant.DialogSearchApplicantApplication.educationalAchievement = "";
    }
    git_aptra.SearchApplicant.DialogSearchApplicantApplication.vacancy = java.lang.String.valueOf(git_aptra.SearchApplicant.DialogSearchApplicantApplication.boxVacancy.getSelectedItem());
    if (git_aptra.SearchApplicant.DialogSearchApplicantApplication.vacancy.equals("Bitte ausw�hlen")) {
        git_aptra.SearchApplicant.DialogSearchApplicantApplication.vacancy = "";
    }
}