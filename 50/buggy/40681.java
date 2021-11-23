@com.deltacom.app.controllers.ResponseBody
@com.deltacom.app.controllers.RequestMapping(value = "/blockContract", produces = "application/json")
public boolean blockContract(@com.deltacom.app.controllers.RequestParam(value = "contractId")
int contractId, @com.deltacom.app.controllers.RequestParam(value = "block")
boolean blockContract) {
    contractService.blockContract(contractId, blockContract);
    return true;
}