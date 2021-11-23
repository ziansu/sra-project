public static br.ufg.inf.es.saep.sandbox.dominio.Valor dataFromString(final java.lang.String data) {
    java.time.LocalDate parsedDate;
    try {
        parsedDate = java.time.LocalDate.parse(data, br.ufg.inf.es.saep.sandbox.dominio.Valor.FORMATO_DATA);
    } catch (java.time.format.DateTimeParseException exp) {
        return null;
    }
    return new br.ufg.inf.es.saep.sandbox.dominio.Valor(parsedDate);
}