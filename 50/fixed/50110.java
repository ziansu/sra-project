@java.lang.Override
public void assertEquals(io.robe.admin.hibernate.entity.Role model, io.robe.admin.hibernate.entity.Role response) {
    org.junit.Assert.assertEquals(model.getName(), response.getName());
}