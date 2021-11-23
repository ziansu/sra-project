@org.springframework.web.bind.annotation.RequestMapping(value = "/api/v1/{userId}/convos/{convoId}", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public void changeConvoReadStatus(@org.springframework.web.bind.annotation.PathVariable
final long userId, @org.springframework.web.bind.annotation.PathVariable
final long convoId) {
    convoService.changeConvoReadStatus(convoId);
}