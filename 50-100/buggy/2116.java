@java.lang.Override
public boolean apply(final nl.tudelft.ewi.devhub.server.database.entities.CommitComment input) {
    if ((input.getNewFilePath()) != null) {
        return (input.getNewFilePath().equals(newPath)) && (input.getNewLineNumber().equals(newNumber));
    }
    return (input.getOldFilePath().equals(oldPath)) && (input.getOldLineNumber().equals(oldNumber));
}