@org.springframework.web.bind.annotation.RequestMapping(value = "/api/scores/post", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void postScore(@org.springframework.web.bind.annotation.RequestBody
cse280.project.api.scores.Score score) {
    cse280.project.api.scores.ScoreManager.addScore(score);
}