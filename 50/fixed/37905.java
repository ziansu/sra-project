@org.springframework.web.bind.annotation.RequestMapping(value = "/halogens", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<com.hazelcast.samples.spring.data.chemistry.domain.Element> halogens() {
    return this.chemistryService.findElementsByGroupSorted(17);
}