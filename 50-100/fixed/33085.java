protected javafx.util.Pair<team_f.application.InstrumentType, java.util.List<team_f.domain.entities.Person>> getMusicianListByInstrumentType(team_f.application.InstrumentType instrumentType, java.util.List<javafx.util.Pair<team_f.application.InstrumentType, java.util.List<team_f.domain.entities.Person>>> list) {
    javafx.util.Pair<team_f.application.InstrumentType, java.util.List<team_f.domain.entities.Person>> pair = null;
    for (javafx.util.Pair<team_f.application.InstrumentType, java.util.List<team_f.domain.entities.Person>> exPair : list) {
        if (exPair.getKey().equals(instrumentType)) {
            pair = exPair;
        }
    }
    return pair;
}