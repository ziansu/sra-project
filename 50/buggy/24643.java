@java.lang.Override
public com.excilys.shooflers.dashboard.server.dto.ValidityDto toDto(com.excilys.shooflers.dashboard.server.model.Validity model) {
    return new com.excilys.shooflers.dashboard.server.dto.ValidityDto(model.getStart().format(com.excilys.shooflers.dashboard.server.dto.mapper.ValidityDtoMapperImpl.FORMATTER), model.getEnd().format(com.excilys.shooflers.dashboard.server.dto.mapper.ValidityDtoMapperImpl.FORMATTER));
}