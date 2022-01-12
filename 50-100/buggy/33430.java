@java.lang.Override
public java.util.List<entities.MenuItem> getAllItemsFromKitchen(int id) {
    java.lang.String query = "SELECT m from MenuItem m where m.kitchen.id = :id";
    java.util.List<entities.MenuItem> menuItems = em.createQuery(query, entities.MenuItem.class).setParameter("id", id).getResultList();
    entities.Course course = new entities.Course();
    course = em.find(entities.Course.class, id);
    course.getName();
    for (entities.MenuItem menuItem : menuItems) {
        java.lang.System.out.println(menuItem);
    }
    return menuItems;
}