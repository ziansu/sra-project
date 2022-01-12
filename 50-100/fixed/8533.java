@org.junit.Before
public void createTransformer() throws ddf.catalog.federation.FederationException, ddf.catalog.source.SourceUnavailableException, ddf.catalog.source.UnsupportedQueryException {
    ddf.catalog.transformer.nitf.NitfInputTransformer transformer = new ddf.catalog.transformer.nitf.NitfInputTransformer();
    ddf.catalog.transformer.nitf.ddf.catalog.CatalogFramework catalog = org.mockito.Mockito.mock(ddf.catalog.CatalogFramework.class);
    org.mockito.Mockito.when(catalog.query(org.mockito.Matchers.any(ddf.catalog.operation.QueryRequest.class))).thenReturn(new ddf.catalog.operation.impl.QueryResponseImpl(null, "sourceId"));
    transformer.setMetacardFactory(ddf.catalog.transformer.nitf.TestBasicInputTransformer.metacardFactory);
    this.transformer = transformer;
}