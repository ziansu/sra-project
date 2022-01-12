private void newSection(java.lang.String title) {
    section = new transtool.quiz.Element("section");
    transtool.quiz.Attribute sectionTitle = new transtool.quiz.Attribute("title", title);
    section.addAttribute(sectionTitle);
    ++(count);
    transtool.quiz.Attribute sectionIdent = new transtool.quiz.Attribute("ident", "ident");
    section.addAttribute(sectionIdent);
    assesment.appendChild(section);
}