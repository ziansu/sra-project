@java.lang.SuppressWarnings(value = "rawtypes")
public static void save() {
    if (((git_aptra.AddVacancy.DialogAddVacancyGeneral.getGeneral()) == true) && ((git_aptra.AddVacancy.DialogAddVacancySpecification.getSpecification()) == true)) {
        try {
            git_aptra.AddVacancy.InsertVacancyDataIntoDatabase.insertVacancyData();
            git_aptra.AddVacancy.InsertVacancyDataIntoDatabase.insertVacancyevaluationData();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        DialogAddVacancy.dialogNewVacancy.dispose();
        java.util.Vector resultsVacancy = git_aptra.AddVacancy.InsertVacancyDataIntoTable.insertVacancyDataIntoTable();
        MenuBarPanelVacancy.modelJob.setDataVector(resultsVacancy, MenuBarPanelVacancy.COLUMN_IDENTIFIERS_JOB);
        MenuBarPanelVacancy.modelJob.fireTableDataChanged();
        DialogAddVacancy.dialogNewVacancy.dispose();
    }
}