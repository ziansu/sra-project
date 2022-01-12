@org.springframework.web.bind.annotation.RequestMapping(value = "/{branch}/{number}/{type}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public com.mac.green_leaves.v1.green_leaves.green_leaves_weigh.model.TGreenLeavesWeigh getSummary(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer number, @org.springframework.web.bind.annotation.PathVariable
java.lang.Integer branch, @org.springframework.web.bind.annotation.PathVariable
java.lang.String type) {
    return greenLeavesWeighService.getSummary(branch, number, type);
}