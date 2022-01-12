topl.Checker.State pushEvent(topl.Checker.Event event) {
    return new topl.Checker.State(vertex, store, events.push(event), parent, time, id);
}