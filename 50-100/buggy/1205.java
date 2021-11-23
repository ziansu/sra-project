@java.lang.Override
public boolean keep(java.lang.String token, howardwu.io.ors.api.common.enumtype.Role role) {
    howardwu.io.ors.api.model.SessionContext context = contextMapper.getByToken(token);
    if ((context == null) || (context.getExpired())) {
        throw new howardwu.io.ors.api.exception.UnauthorizedException();
    }else
        if (!(context.getRole().equals(role))) {
            throw new howardwu.io.ors.api.exception.AccessDeniedException();
        }
    
    int success = contextMapper.keep(token, role);
    if (success != 1) {
        throw new howardwu.io.ors.api.exception.UnauthorizedException();
    }
    return true;
}