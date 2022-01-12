public java.lang.String getSuggestedPartnerGender() {
    if (org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_MALE.equals(this.gender)) {
        return org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_FEMALE;
    }
    if (org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_FEMALE.equals(this.gender)) {
        return org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_MALE;
    }
    return org.phenotips.studies.family.migrations.R71498PhenoTips2155DataMigration.SEX_UNKNOWN;
}