@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = org.remipassmoilesel.abcmapfr.Mappings.VOTE_ROOT, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public void postVote(@org.springframework.web.bind.annotation.RequestParam(value = "v", required = true)
int value, @org.springframework.web.bind.annotation.RequestParam(value = "p", required = false)
java.lang.String page) {
    org.remipassmoilesel.abcmapfr.entities.Vote vote = new org.remipassmoilesel.abcmapfr.entities.Vote(value, null, page);
    voteRepository.save(vote);
}