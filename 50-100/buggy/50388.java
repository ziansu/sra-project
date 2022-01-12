private void setEmail(java.lang.String email) throws gppmds.wikilegis.exception.UserException {
    if (stringIsNull(email)) {
        if (validateStringLengthLessThanMax(email, gppmds.wikilegis.model.User.MAX_LENGTH_EMAIL)) {
            if (validateEmailFormat(email)) {
                if (gppmds.wikilegis.controller.RegisterUserController.validateEmailIsNotRepeated(email)) {
                    this.email = email;
                }else {
                    throw new gppmds.wikilegis.exception.UserException(gppmds.wikilegis.model.User.EMAIL_CANT_BE_EQUALS);
                }
            }else {
                throw new gppmds.wikilegis.exception.UserException(gppmds.wikilegis.model.User.INVALID_EMAIL);
            }
        }else {
            throw new gppmds.wikilegis.exception.UserException(gppmds.wikilegis.model.User.EMAIL_CANT_BE_HIGHER_THAN_150);
        }
    }else {
        throw new gppmds.wikilegis.exception.UserException(gppmds.wikilegis.model.User.EMAIL_CANT_BE_EMPTY_EMAIL);
    }
}