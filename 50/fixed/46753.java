private boolean isCommandStringValid() {
    java.util.Set<seedu.address.logic.parser.CommandArgs> argsPresent = argumentValuesMap.keySet();
    return argsPresent.containsAll(requiredArguments);
}