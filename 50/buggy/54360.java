@java.lang.Override
public void update(master.pam.crud.impl.entity.base.IdEntity aEntity) {
    entityManager.merge(aEntity);
    entityManager.flush();
    entityManager.getTransaction().commit();
}