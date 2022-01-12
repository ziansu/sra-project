private ch.notenrechner.Note readNextNote(java.util.Scanner s) {
    try {
        if (s.hasNext()) {
            return new ch.notenrechner.Note(s.nextDouble(), s.next(), java.time.LocalDate.parse(s.next()));
        }else {
            return null;
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Es ist ein Fehler aufgetreten!");
        e.printStackTrace();
        return null;
    }
}