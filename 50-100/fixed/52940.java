@com.disney.studios.controller.RequestMapping(value = "/dog/downvote/{url}", method = RequestMethod.PUT)
@com.disney.studios.controller.ResponseBody
public java.lang.String downvoteDog(@com.disney.studios.controller.PathVariable
java.lang.String url) {
    java.lang.String dec_url = com.disney.studios.Utils.decodeUrl(url);
    java.lang.Long id = java.lang.Long.parseLong(dogRepository.getIdByUrl(dec_url));
    com.disney.studios.domain.Dog d = dogRepository.findOne(id);
    if (d == null) {
        return com.disney.studios.Utils.jsonifyRes("Could not find dog");
    }
    d.downvote();
    dogRepository.save(d);
    return com.disney.studios.Utils.jsonifyRes("Succesfully downvoted dog");
}