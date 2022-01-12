@org.junit.Before
public void setUp() throws java.lang.Exception {
    emf = javax.persistence.Persistence.createEntityManagerFactory("GGO");
    em = emf.createEntityManager();
    player = em.find(entities.Player.class, 1);
    game = em.find(entities.Game.class, 1);
    message = em.find(entities.Message.class, 1);
}