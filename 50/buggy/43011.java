public java.lang.String getSuggestedPartnerGender() {
    java.lang.String gender = this.getGender();
    if (org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_MALE.equals(gender)) {
        return org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_FEMALE;
    }
    if (org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_FEMALE.equals(gender)) {
        return org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_MALE;
    }
    return org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_UNKNOWN;
}