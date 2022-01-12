@org.springframework.web.bind.annotation.RequestMapping(path = "/addoredit", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String edit(com.rebekahperkins.website.domain.Poem poem, org.springframework.ui.Model model, java.security.Principal principal) {
    com.rebekahperkins.website.domain.User loggedInUser = ((com.rebekahperkins.website.domain.User) (((org.springframework.security.authentication.UsernamePasswordAuthenticationToken) (principal)).getPrincipal()));
    poem.setSubmittedBy(loggedInUser);
    if (null != (poem.getId())) {
        poem = poemService.get(poem.getId());
    }
    poem = poemService.addOrUpdate(poem);
    return "redirect:/cats/" + (poem.getId());
}