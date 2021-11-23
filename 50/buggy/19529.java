@org.junit.Test
public void testSubmitContract() {
    edu.ynu.entity.ContractEntity contract = new edu.ynu.entity.ContractEntity();
    contract.setPlanNum("PC20160626");
    contract.setConstractName("合同名字1");
    recorderService.submitContract(contract);
}