@org.springframework.web.bind.annotation.RequestMapping(value = "/httpgetreq", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public void home_page(@org.springframework.web.bind.annotation.ModelAttribute(value = "SpringWeb")
com.webQ.model.HttpRequest req, @org.springframework.web.bind.annotation.RequestParam(value = "rownum")
int rownum) throws co.paralleluniverse.fibers.SuspendExecution {
    if (rownum == (testPlan.size())) {
        testPlan.add(req);
        httpreqlist.add(rownum);
    }else
        testPlan.set(rownum, req);
    
}