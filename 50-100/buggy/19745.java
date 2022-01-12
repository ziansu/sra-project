@org.junit.Before
public void setup() {
    org.mockito.Mockito.when(reader.readHeaderRow()).thenReturn(new java.lang.String[]{ head1 , head2 , head3 });
    org.mockito.Mockito.when(reader.readDataRows()).thenReturn(new java.lang.String[]{ row1col1 , row1col2 , row1col3 }, new java.lang.String[]{ row2col1 , row2col2 , row2col3 }, null);
}