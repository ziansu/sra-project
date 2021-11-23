@java.lang.Override
public void addFolder(java.lang.String name, int parent, java.lang.String description) {
    edu.j2ee.das.entity.Items p = null;
    if (parent > 0) {
        p = getItemByID(java.math.BigDecimal.valueOf(parent));
    }
    edu.j2ee.das.entity.Authors a = getAuthorByID(java.math.BigDecimal.ZERO);
    edu.j2ee.das.entity.Items f = new edu.j2ee.das.entity.Items(name, null, true, description, p, a);
    em.persist(f);
}