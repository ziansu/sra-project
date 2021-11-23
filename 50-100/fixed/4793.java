@org.junit.Test
public void name() throws java.lang.Exception {
    net.autobuilder.examples.Animal spiderPig = net.autobuilder.examples.Animal_Builder.builder().name("Spider-Pig").build();
    net.autobuilder.examples.Animal horse = net.autobuilder.examples.Animal_Builder.builder(spiderPig).name("Horse").build();
    org.junit.Assert.assertThat(spiderPig.getName(), org.hamcrest.core.Is.is("Spider-Pig"));
    org.junit.Assert.assertThat(horse.getName(), org.hamcrest.core.Is.is("Horse"));
}