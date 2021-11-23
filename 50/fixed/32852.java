@java.lang.Override
public java.lang.String getMatchDetail(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id, org.springframework.ui.Model model) {
    com.rival.hs.match.domain.MatchDo matchDo = matchMongoRepository.findOne(id);
    model.addAttribute("board", matchDo);
    return "match/match_detail_view";
}