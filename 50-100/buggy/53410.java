@org.springframework.web.bind.annotation.RequestMapping(value = "/createuser", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String createuser(@org.springframework.web.bind.annotation.RequestBody
nl.ru.languageininteraction.vst.model.Player player) {
    if (((player.getHiddenEmail()) == null) || (player.getHiddenEmail().isEmpty())) {
        throw new java.lang.IllegalArgumentException("The 'email' parameter is required");
    }
    if (((player.getHiddenToken()) == null) || (player.getHiddenToken().isEmpty())) {
        throw new java.lang.IllegalArgumentException("The 'token' parameter is required");
    }
    participantRepository.save(player);
    return "Created: " + (player.getEmail());
}