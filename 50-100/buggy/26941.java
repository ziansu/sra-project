@org.junit.Test
public void builderTest() throws java.lang.Exception {
    org.phenopackets.api.model.condition.Phenotype.Builder pb = new org.phenopackets.api.model.condition.Phenotype.Builder();
    pb.addType("X:1").description("test description");
    org.phenopackets.api.model.condition.Phenotype p = pb.build();
    java.lang.System.out.println(org.phenopackets.api.io.JsonGenerator.render(p));
    java.lang.System.out.println(org.phenopackets.api.io.YamlGenerator.render(p));
    org.phenopackets.api.model.entity.Entity e = new org.phenopackets.api.model.entity.Disease();
    java.lang.System.out.println(org.phenopackets.api.io.JsonGenerator.render(e));
    java.lang.System.out.println(org.phenopackets.api.io.YamlGenerator.render(e));
}