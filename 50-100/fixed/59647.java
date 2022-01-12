@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<com.plantplaces.dto.Plant> fetchPlants(com.plantplaces.dto.Plant plant) {
    org.hibernate.Session session = com.plantplaces.dao.HibernateUtil.getSessionFactory().openSession();
    org.hibernate.Query query = session.createQuery("from Plant where common like :common");
    query.setParameter("common", (("%" + (plant.getCommon())) + "%"));
    @java.lang.SuppressWarnings(value = "rawtypes")
    java.util.List list = query.list();
    java.util.List<com.plantplaces.dto.Plant> plants = java.util.Collections.checkedList(list, com.plantplaces.dto.Plant.class);
    return plants;
}