private void setAuthorList(org.springframework.ui.Model model) {
    java.util.ArrayList<com.springapp.mvc.model.Author> authors = com.google.common.collect.Lists.newArrayList(authorRepository.findAll());
    model.addAttribute("authorList", authors);
}