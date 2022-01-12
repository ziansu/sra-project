public static boolean validateRole(java.lang.String role) throws dto.Validator.InputException {
    for (int i = 0; i < (dto.Validator.validRoles.length); i++) {
        if (!(role.equals(dto.Validator.validRoles[i]))) {
            throw new dto.Validator.InputException("This is not a valid role.");
        }
    }
    return true;
}