@ru.ligaonline.web.controller.PostMapping(value = "/user/subscribeTournament")
@ru.ligaonline.web.controller.ResponseBody
public ru.ligaonline.web.util.GenericResponse subscribeTournament(final java.util.Locale locale, final ru.ligaonline.entity.FavoriteTournament fav, javax.servlet.http.HttpServletRequest request) {
    final ru.ligaonline.entity.User user = userRepository.findByUsername(request.getUserPrincipal().getName());
    return new ru.ligaonline.web.util.GenericResponse(messages.getMessage("message.updatePasswordSuc", null, locale));
}