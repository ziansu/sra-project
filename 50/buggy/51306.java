@org.springframework.web.bind.annotation.RequestMapping(value = "/rest/inputArray", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<org.lrpb.demo.devActivity.beans.InputArraySessionBean> setInputArray(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
org.lrpb.demo.devActivity.beans.InputArraySessionBean pInputArray) {
    inputArray.assing(pInputArray);
    org.springframework.http.ResponseEntity<org.lrpb.demo.devActivity.beans.InputArraySessionBean> response = new org.springframework.http.ResponseEntity<org.lrpb.demo.devActivity.beans.InputArraySessionBean>(pInputArray, org.springframework.http.HttpStatus.OK);
    return response;
}