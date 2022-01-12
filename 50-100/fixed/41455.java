private void doBytes(byte[] bytes, int start, int len) throws java.io.IOException {
    org.apache.avro.io.parsing.ParquetGrammarGenerator.FieldWriteAction<org.apache.avro.io.parquet.Parquet.Column.Bytes> top = ((org.apache.avro.io.parsing.ParquetGrammarGenerator.FieldWriteAction<org.apache.avro.io.parquet.Parquet.Column.Bytes>) (parser.popSymbol()));
    top.col.write(bytes, start, len);
}