@org.springframework.web.bind.annotation.RequestMapping(value = "/getUserByNextPaymentDate", produces = "application/json", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.sfm.model.Fees> getTags() {
    java.util.List<com.sfm.model.Fees> feesList = new java.util.ArrayList<com.sfm.model.Fees>();
    java.util.List<java.lang.Object[]> dataList = feesService.getUserByNextPaymentDate();
    for (java.lang.Object[] objects : dataList) {
        com.sfm.model.User u = ((com.sfm.model.User) (objects[0]));
        com.sfm.model.Fees f = ((com.sfm.model.Fees) (objects[1]));
        f.setUser(u);
        feesList.add(f);
    }
    return feesList;
}