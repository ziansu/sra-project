private ru.timurnav.resume.model.sections.MultiTextSection readMultiTextSection(ru.timurnav.resume.storage.file.DataStreamFileStorage.CustomDataInputStream dis) throws java.io.IOException {
    java.util.List<java.lang.String> lines = new java.util.ArrayList<>();
    for (int i = 0; i < (dis.readInt()); i++) {
        lines.add(dis.readUTF());
    }
    return new ru.timurnav.resume.model.sections.MultiTextSection(lines);
}