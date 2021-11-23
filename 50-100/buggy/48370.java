private java.util.Collection<? extends se.inera.certificate.modules.ts_diabetes.model.external.Aktivitet> convertAktiviteter(java.util.List<se.inera.certificate.ts_diabetes.model.v1.AktivitetType> source) throws se.inera.certificate.modules.ts_diabetes.model.converter.ConverterException {
    if (source == null) {
        throw new se.inera.certificate.modules.ts_diabetes.model.converter.ConverterException("No aktiviteter found, conversion stopped");
    }
    java.util.List<se.inera.certificate.modules.ts_diabetes.model.external.Aktivitet> aktiviteter = new java.util.ArrayList<se.inera.certificate.modules.ts_diabetes.model.external.Aktivitet>();
    for (se.inera.certificate.ts_diabetes.model.v1.AktivitetType akt : source) {
        aktiviteter.add(convertAktivitet(akt));
    }
    return aktiviteter;
}