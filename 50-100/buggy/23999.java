@java.lang.Override
public void delete(org.jboss.aerogear.unifiedpush.api.PushApplication pushApplication) {
    org.jboss.aerogear.unifiedpush.api.PushApplication entity = entityManager.find(org.jboss.aerogear.unifiedpush.api.PushApplication.class, pushApplication.getId());
    final java.util.List<org.jboss.aerogear.unifiedpush.api.Variant> variants = entity.getVariants();
    if (!(variants.isEmpty())) {
        createQuery("delete from Installation i where i.variant in :variants").setParameter("variants", variants).executeUpdate();
    }
    super.delete(entity);
}