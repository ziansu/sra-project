@org.springframework.web.bind.annotation.RequestMapping(value = "/apply/{jobId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showForm(@org.springframework.web.bind.annotation.PathVariable
int jobId, org.springframework.ui.Model model) {
    checkJobId(jobId);
    model.addAttribute(new net.ukrtel.ddns.ff.Appliant(jobsRepository.findOne(jobId)));
    return "applyForm";
}