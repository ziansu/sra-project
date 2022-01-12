@org.springframework.web.bind.annotation.RequestMapping(value = "/savenormaltestplan", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public void home_page(@org.springframework.web.bind.annotation.ModelAttribute(value = "SpringWeb")
com.webQ.model.TestPlan newTestPlan) throws co.paralleluniverse.fibers.SuspendExecution {
    newTestPlan.setTestPlan(testPlan);
    newTestPlan.setHttpreqlist(httpreqlist);
    testPlans.add(newTestPlan);
    testPlan = new java.util.ArrayList<java.lang.Object>();
    httpreqlist = new java.util.ArrayList<java.lang.Integer>();
}