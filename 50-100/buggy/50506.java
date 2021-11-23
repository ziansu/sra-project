@org.springframework.web.bind.annotation.RequestMapping(value = "/member/updatepassword.html", method = org.springframework.web.bind.annotation.RequestMethod.POST)
private java.lang.String updatePassword(@org.springframework.web.bind.annotation.ModelAttribute
formgenerator.model.Member member, org.springframework.validation.BindingResult bindingResult) {
    passwordValidator.validate(member, bindingResult);
    if (bindingResult.hasErrors())
        return "member/updatePassword";
    
    if ((bCryptPasswordEncoder) == null)
        bCryptPasswordEncoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    
    member.setPassword(bCryptPasswordEncoder.encode(member.getPassword()));
    formgenerator.model.Member savedMember = memberDao.saveMember(member);
    return "redirect:../form/list.html";
}