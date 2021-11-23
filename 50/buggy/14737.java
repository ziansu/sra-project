@java.lang.Override
public void updateUser(pers.posse.tool.service.dto.UserDto userDto) {
    pers.posse.tool.service.impl.domain.User user = emWrite.find(pers.posse.tool.service.impl.domain.User.class, userDto.getId());
    pers.posse.tool.service.impl.parser.UserDtoParser.fromDto(user, userDto);
}