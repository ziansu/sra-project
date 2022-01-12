public static void launchPostMigration() {
    org.eyeseetea.malariacare.database.migrations.Migration2Database.postMigrate();
    org.eyeseetea.malariacare.database.migrations.Migration3AddQuestionColumn.postMigrate();
    org.eyeseetea.malariacare.database.migrations.Migration4AddQuestionVisibleColumn.postMigrate();
    org.eyeseetea.malariacare.database.migrations.Migration5AddOptionAttributeColumns.postMigrate();
    org.eyeseetea.malariacare.database.migrations.Migration6AddOptionTextSizeColumn.postMigrate();
    org.eyeseetea.malariacare.database.migrations.Migration7AddQuestionPathAttributeColumn.postMigrate();
}