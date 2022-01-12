@fr.univ.controller.RequestMapping(value = "", method = RequestMethod.GET)
@fr.univ.controller.ResponseBody
public fr.univ.modele.CVList getCVInXML() throws java.net.UnknownHostException {
    return list;
}