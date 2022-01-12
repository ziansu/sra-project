@org.junit.Test
public void test() throws java.lang.Exception {
    org.phenopackets.api.model.condition.Phenotype p = new org.phenopackets.api.model.condition.Phenotype();
    org.phenopackets.api.model.ontology.OntologyClass oc = new org.phenopackets.api.model.ontology.OntologyClass.Builder("X:1").setLabel("foo").build();
    p.setDescription("foo");
    java.lang.System.out.println(org.phenopackets.api.io.YamlGenerator.render(p));
    org.phenopackets.api.model.entity.Entity e = new org.phenopackets.api.model.entity.Disease();
    java.lang.System.out.println(org.phenopackets.api.io.YamlGenerator.render(e));
}