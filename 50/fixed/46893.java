@java.lang.Override
protected void addSystemResources() {
    super.addSystemResources();
    resources.remove(uk.gov.gchq.gaffer.rest.serialisation.RestJsonProvider.class);
    resources.add(uk.gov.gchq.gaffer.rest.serialisation.ExampleRestJsonProvider.class);
}