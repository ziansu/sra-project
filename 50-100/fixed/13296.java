@org.springframework.web.bind.annotation.RequestMapping(value = "/scrape")
public java.lang.String scrape(@org.springframework.web.bind.annotation.RequestParam(value = "url", required = true, defaultValue = "")
java.lang.String url, org.springframework.ui.Model model) {
    try {
        runScrape(url);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    wk.app.models.ReviewService revService = context.getBean(wk.app.models.ReviewService.class);
    java.util.List<wk.app.models.Review> allRev = revService.listAll();
    java.util.Collections.sort(allRev);
    model.addAttribute("data", allRev);
    return "scrape";
}