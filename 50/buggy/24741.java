@org.junit.Test
public void hasId() {
    org.energyos.espi.common.support.TestUtils.assertAnnotationPresent(org.energyos.espi.common.domain.ServiceCategory.class, "kind", javax.persistence.Id.class);
}