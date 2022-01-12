private void initSearchCondition(org.unicef.rapidreg.model.User.Role roleType) {
    switch (roleType) {
        case CP :
            {
                idField.setVisibility(View.VISIBLE);
                nameField.setVisibility(View.VISIBLE);
                ageField.setVisibility(View.VISIBLE);
                caregiverField.setVisibility(View.VISIBLE);
                registrationDateField.setVisibility(View.VISIBLE);
                break;
            }
        case GBV :
            idField.setVisibility(View.VISIBLE);
            nameField.setVisibility(View.VISIBLE);
            registrationDateField.setVisibility(View.VISIBLE);
            locationField.setVisibility(View.VISIBLE);
            break;
    }
}