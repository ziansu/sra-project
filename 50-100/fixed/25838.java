@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addSkills(@org.springframework.web.bind.annotation.RequestParam
java.lang.String label, @org.springframework.web.bind.annotation.RequestParam
java.lang.String description, org.springframework.ui.Model model) {
    com.amaydanskiy.model.Skill newSkill = new com.amaydanskiy.model.Skill();
    newSkill.setLabel(label);
    newSkill.setDescription(description);
    skillRepository.save(newSkill);
    model.addAttribute("skills", skillRepository.findAll());
    return "skills";
}