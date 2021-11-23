public void store(com.edu.library.model.Author p_value) {
    try {
        dataAcces.getByname(p_value.getName());
        throw new com.edu.library.business.exception.BusinessException(com.edu.library.business.exception.ErrorMessages.ERROR_CONSTRAINT_VIOLATION);
    } catch (com.edu.library.data.exception.TechnicalException e) {
        dataAcces.store(p_value);
    }
}