public java.lang.String kursWahlspeichern_2() {
    java.lang.String posId = getRequestParameter("kursId");
    for (fachklassen.Kurs k : alleKurse) {
        if ((k.getKursId()) == (java.lang.Long.parseLong(posId))) {
            auslandskurs = k;
        }
    }
    learningAgreement.getLearningAgreementPositionen().add(new fachklassen.LearningAgreementPosition(inlandskurs, auslandskurs));
    return "learningAgreementBearbeiten";
}