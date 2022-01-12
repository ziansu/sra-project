@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String listReplays(org.springframework.ui.Model model) {
    org.springframework.data.domain.Pageable pageable = new org.springframework.data.domain.PageRequest(0, 25, Sort.Direction.DESC, "gameDate");
    org.springframework.data.domain.Page<RS.domain.Replay> riddlePage = replayRepository.findAll(pageable);
    model.addAttribute("replays", riddlePage.getContent());
    return "replays";
}