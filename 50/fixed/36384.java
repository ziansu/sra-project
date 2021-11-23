public java.lang.Boolean getRegistrationNumberNotEmptyAndNotResearch() {
    return (((registrationNumber) != null) && (!(registrationNumber.isEmpty()))) && (!(org.innovateuk.ifs.user.resource.OrganisationTypeEnum.isResearch(organisationTypeId)));
}