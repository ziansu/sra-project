@org.springframework.web.bind.annotation.RequestMapping(value = "casediagmedic", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView displayDiagMedicineByCase() {
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView("casePredictMedicine");
    java.util.List<java.lang.String> batchList = com.um.util.DiagMedicineProcess.getBatch();
    java.util.List<com.um.model.EHealthRecord> aList = com.um.util.MedicineByDescription.getRecordsByBatch("2012");
    int allcount = aList.size();
    mv.addObject("allcount", allcount);
    mv.addObject("batchList", batchList);
    return mv;
}