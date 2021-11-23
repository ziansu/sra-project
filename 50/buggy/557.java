@java.lang.Override
public co.edu.unicartagena.platf.entity.User findUserByEmail(java.lang.String email) throws co.edu.unicartagena.platf.dao.exception.NotCreatedEntityManagerException {
    java.util.List<co.edu.unicartagena.platf.dao.controller.Parameter> parameters = java.util.Arrays.asList(new co.edu.unicartagena.platf.dao.controller.Parameter("email", email));
    java.lang.String errorMessage = java.lang.String.format("The user with email %s was not found", email);
    return executeNamedQuery("user.findByEmail", parameters, errorMessage);
}