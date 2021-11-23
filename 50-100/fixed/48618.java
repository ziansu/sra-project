@org.junit.Test
public void createsJoinForOptionalAssociation() {
    javax.persistence.criteria.CriteriaBuilder builder = em.getCriteriaBuilder();
    javax.persistence.criteria.CriteriaQuery<org.springframework.data.jpa.domain.sample.User> query = builder.createQuery(org.springframework.data.jpa.domain.sample.User.class);
    javax.persistence.criteria.Root<org.springframework.data.jpa.domain.sample.User> root = query.from(org.springframework.data.jpa.domain.sample.User.class);
    org.springframework.data.jpa.repository.query.QueryUtils.toExpressionRecursively(root, org.springframework.data.mapping.PropertyPath.from("manager", org.springframework.data.jpa.domain.sample.User.class));
    assertThat(root.getJoins()).hasSize(1);
}