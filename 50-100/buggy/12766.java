@org.junit.Test
public void testCollectionAsBasic() {
    org.hibernate.boot.registry.StandardServiceRegistry ssr = new org.hibernate.boot.registry.StandardServiceRegistryBuilder().build();
    try {
        org.hibernate.boot.Metadata metadata = new org.hibernate.boot.MetadataSources().addAnnotatedClass(org.hibernate.test.annotations.basic.CollectionAsBasicTest.Post.class).getMetadataBuilder().applyBasicType(new org.hibernate.test.annotations.basic.CollectionAsBasicTest.DelimitedStringsType()).build();
        org.hibernate.mapping.PersistentClass postBinding = metadata.getEntityBinding(org.hibernate.test.annotations.basic.CollectionAsBasicTest.Post.class.getName());
        org.hibernate.mapping.Property tagsAttribute = postBinding.getProperty("tags");
    } finally {
        org.hibernate.boot.registry.StandardServiceRegistryBuilder.destroy(ssr);
    }
}