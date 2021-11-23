public T addAttributes() throws net.parostroj.timetable.model.ls.LSException {
    object.getAttributes().add(attributes.createAttributes(mapping));
    return object;
}