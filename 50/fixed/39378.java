private DiagramChange.Type getChangeType(net.parostroj.timetable.model.changes.Event event) {
    net.parostroj.timetable.model.changes.DiagramChange.Type type = (event.getType().isList()) ? converter.getType(event.getObject()) : null;
    return type;
}