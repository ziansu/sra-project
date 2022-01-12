@org.springframework.web.bind.annotation.RequestMapping(value = "/getCache")
public java.lang.String getCache(org.springframework.ui.Model m) {
    java.lang.String cache = this.cache.toString();
    if ((cache.length()) < 2)
        m.addAttribute("cache", "No cache available");
    else
        m.addAttribute("cache", (("<span>" + cache) + "</span>"));
    
    return "getCache";
}