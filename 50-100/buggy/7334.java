@org.springframework.web.bind.annotation.RequestMapping(value = "getSchoolById", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView getSchoolById(@org.springframework.web.bind.annotation.RequestParam
int schId) {
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView("school_update");
    java.util.List<bean.School> schoolList = schoolService.getSchoolbyId(schId);
    if (!(schoolList.isEmpty())) {
        bean.School school = schoolList.get(0);
        schoolTimeHelper.Date2String_School(school);
        java.lang.System.out.println(school.getIOdeadLine());
        mv.addObject("school", school);
    }else {
        java.lang.System.out.println(" no such school");
    }
    return mv;
}