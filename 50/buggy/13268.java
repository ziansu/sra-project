@org.springframework.web.bind.annotation.RequestMapping(value = "/readimage")
public com.friendsSuggestor.model.FriendSuggestor readimage(java.lang.String name, java.lang.String identification) {
    com.friendsSuggestor.model.FriendSuggestor friendSuggestor = suggestorService.read(name, identification);
    return friendSuggestor;
}