@java.lang.Override
public edu.mayo.mprc.searchdb.dao.TandemMassSpectrometrySample getTandemMassSpectrometrySample(java.lang.String biologicalSampleName, java.lang.String fractionName) {
    return new edu.mayo.mprc.searchdb.dao.TandemMassSpectrometrySample(new java.io.File(fractionName), new java.util.Date(), 0, 0, "Dummy", new java.util.Date(), 0.0, "", "", "", "", "");
}