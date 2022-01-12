@org.junit.Test
public void resolve() throws java.lang.Exception {
    java.lang.String dna = "AUGGCCAUGGCGCCCAGAACUGAGAUCAAUAGUACCCGUAUUAACGGGUGA";
    java.lang.System.out.println(dna.length());
    java.lang.String result = trp.resolve(dna);
    org.junit.Assert.assertThat(result, org.hamcrest.CoreMatchers.is("MAMAPRTEINSTRING"));
}