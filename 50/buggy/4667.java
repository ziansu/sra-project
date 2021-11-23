@org.springframework.web.bind.annotation.RequestMapping(value = "/technologies", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void technologies(@org.springframework.web.bind.annotation.RequestBody
edu.sjsu.Technologies technologies, org.springframework.ui.Model model) throws org.springframework.web.client.RestClientException {
    if ((connectionRepository.findPrimaryConnection(edu.sjsu.LinkedIn.class)) == null) {
    }
    java.util.ArrayList<edu.sjsu.Technology> items = technologies.getItems();
    technologyRepository.save(items);
}