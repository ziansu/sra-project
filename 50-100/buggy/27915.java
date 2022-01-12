@java.lang.Override
public model.PositionDTO getPosition(model.UsersDTO users) throws data.DAOException {
    javax.persistence.EntityManagerFactory emfactory = javax.persistence.Persistence.createEntityManagerFactory("jpa-laps");
    javax.persistence.EntityManager entitymanager = emfactory.createEntityManager();
    model.PositionDTO p = entitymanager.find(model.PositionDTO.class, users.getPositionId());
    return p;
}