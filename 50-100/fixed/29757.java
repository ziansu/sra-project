@java.lang.Override
public boolean setAutorization(java.lang.String username, java.lang.String password) {
    boolean result = false;
    entityCompany = ((tel_ran.tests.entitys.EntityCompany) (em.createQuery((("Select c from EntityCompany c where c.C_Name='" + username) + "'")).getSingleResult()));
    if ((entityCompany) != null) {
        if (entityCompany.getPassword().equals(password)) {
            result = true;
        }else {
            result = false;
        }
    }
    this.id = entityCompany.getId();
    return result;
}