public static ch.eonum.pipeline.core.SequenceDataSet<ch.eonum.pipeline.core.SparseSequence> readDataSet(java.lang.String dataset, int timeLag) throws java.io.IOException {
    ch.eonum.pipeline.core.SparseSequence s = ch.eonum.cryptotrader.CryptsyMarketDataReader.readSequence(dataset);
    ch.eonum.pipeline.core.SequenceDataSet<ch.eonum.pipeline.core.SparseSequence> data = new ch.eonum.pipeline.core.SequenceDataSet<ch.eonum.pipeline.core.SparseSequence>();
    data.add(s);
    return data;
}