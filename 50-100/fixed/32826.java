public com.groupeseb.ofs.core.model.program.Program createProgram(com.groupeseb.mediaimport.model.ProgramDTO dto) throws java.io.IOException {
    com.groupeseb.ofs.core.model.program.Program program = dcp.getProgram(dto.getKey());
    if ((dto.getExtraData()) != null) {
        program.setExtraDataFile(mediaReader.createText(dto.getExtraData()).getOriginal());
    }
    program.getMedias().clear();
    for (com.groupeseb.mediaimport.model.MediaDTO mediaDTO : dto.getMedia()) {
        program.getMedias().add(createResourceMedia(mediaDTO));
    }
    return program;
}