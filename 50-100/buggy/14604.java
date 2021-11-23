@org.springframework.web.bind.annotation.RequestMapping(value = "/member/add.html", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority('Admin')")
private java.lang.String add(@org.springframework.web.bind.annotation.ModelAttribute
formgenerator.model.Member member, org.springframework.validation.BindingResult bindingResult) {
    memberValidator.validate(member, bindingResult);
    if (bindingResult.hasErrors())
        return "member/add";
    
    if ((bCryptPasswordEncoder) == null)
        bCryptPasswordEncoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    
    member.setPassword(bCryptPasswordEncoder.encode(member.getPassword()));
    formgenerator.model.Member savedMember = memberDao.saveMember(member);
    return "redirect:list.html";
}