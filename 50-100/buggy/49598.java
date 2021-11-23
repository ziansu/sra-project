@java.lang.Override
public com.google.android.exoplayer2.extractor.ts.TsPayloadReader createPayloadReader(int streamType, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo esInfo) {
    if ((provideCustomEsReader) && (streamType == 3)) {
        esReader = new com.google.android.exoplayer2.extractor.ts.TsExtractorTest.CustomEsReader(esInfo.language);
        return new com.google.android.exoplayer2.extractor.ts.PesReader(esReader);
    }else {
        return defaultFactory.createPayloadReader(streamType, esInfo);
    }
}