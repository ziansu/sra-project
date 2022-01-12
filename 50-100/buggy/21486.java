@org.springframework.web.bind.annotation.RequestMapping(value = "/reviewLO", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void reviewLO(@org.springframework.web.bind.annotation.RequestParam(value = "loid")
java.lang.String id, @org.springframework.web.bind.annotation.RequestParam(value = "rating")
int rating, @org.springframework.web.bind.annotation.RequestParam(value = "comment")
java.lang.String comment) throws java.net.UnknownHostException {
    com.card.loop.xyz.dto.LearningObjectDto lo = new com.card.loop.xyz.dto.LearningObjectDto();
    lo.setId(id);
    lo.setComments(comment);
    lo.setRating(rating);
    loService.reviewLO(lo);
}