public boolean validateName(java.lang.String name) {
    if (name != null) {
        this.oldInput.put(((com.epam.danilchican.betting.tag.OldInputFormAttributeTag.PREFIX) + "name"), name);
        if (!(name.matches(com.epam.danilchican.betting.validator.UserValidator.NAME_REGEX))) {
            this.errors.add("Name must be at least 5 characters as well as contain `_` symbol. The 1st symbol must be [A-Za-z].");
            return false;
        }
    }
    return true;
}