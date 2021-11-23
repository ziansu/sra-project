@java.lang.Override
public boolean login(java.lang.String usernameOrEmail, java.lang.String password) throws co.edu.unicartagena.platf.dao.exception.NotCreatedEntityManagerException {
    java.util.List<co.edu.unicartagena.platf.dao.controller.Parameter> params = java.util.Arrays.asList(new co.edu.unicartagena.platf.dao.controller.Parameter("login", usernameOrEmail), new co.edu.unicartagena.platf.dao.controller.Parameter("password", password));
    co.edu.unicartagena.platf.entity.User user = executeNamedQuery("user.login", params);
    return user != null;
}