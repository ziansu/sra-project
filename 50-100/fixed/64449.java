@org.springframework.web.bind.annotation.RequestMapping(value = "/getById", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.xianda.web.json.response.ListJsonResponse<com.xianda.web.json.bean.ScheduleJsonBean> get(@org.springframework.web.bind.annotation.RequestParam
long id) {
    com.xianda.web.json.response.ListJsonResponse<com.xianda.web.json.bean.ScheduleJsonBean> results;
    java.util.List<com.xianda.web.json.bean.ScheduleJsonBean> lists;
    try {
        lists = scheduleService.findById(id);
        results = new com.xianda.web.json.response.ListJsonResponse<com.xianda.web.json.bean.ScheduleJsonBean>("OK", lists, 0, 1);
    } catch (java.lang.Exception e) {
        results = new com.xianda.web.json.response.ListJsonResponse<com.xianda.web.json.bean.ScheduleJsonBean>("ERROR", e.getMessage());
    }
    return results;
}