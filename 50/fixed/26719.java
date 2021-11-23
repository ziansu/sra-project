@org.springframework.web.bind.annotation.RequestMapping(value = "/new", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String create(org.kitpes.entity.Pet pet) {
    long key = petRepository.save(pet);
    return "redirect:/pet/" + key;
}