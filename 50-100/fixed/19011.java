private void setField(jb.VolunteerDetail.PersonalDetailFieldNameEnum nextPersonalField, java.lang.String value) {
    switch (nextPersonalField) {
        case AGE :
            age = value;
            break;
        case YEARS_OF_SERVICE :
            yearsOfService = value;
            break;
        case GENDER :
            gender = value;
            break;
        case NO_LABEL :
        case OTHER_LABEL :
            break;
        default :
            throw new java.lang.IllegalStateException((nextPersonalField + " is not a valid field name"));
    }
}