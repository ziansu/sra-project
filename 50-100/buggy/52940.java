@com.disney.studios.controller.RequestMapping(value = "/dog/downvote/{url}")
@com.disney.studios.controller.ResponseBody
public java.lang.String downvoteDog(@com.disney.studios.controller.PathVariable
java.lang.String url) {
    java.lang.String dec_url = com.disney.studios.Utils.decodeUrl(url);
    int id = java.lang.Integer.parseInt(dogRepository.getIdByUrl(dec_url));
    com.disney.studios.domain.Dog d = dogRepository.findOne(d.getId());
    if (d == null) {
        return com.disney.studios.Utils.jsonifyRes("Could not find dog");
    }
    d.downvote();
    dogRepository.save(d);
    return com.disney.studios.Utils.jsonifyRes("Succesfully downvoted dog");
}