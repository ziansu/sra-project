@org.springframework.web.bind.annotation.RequestMapping(value = "/write", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String add(@org.springframework.web.bind.annotation.ModelAttribute(value = "GB")
com.honorhs.app.basecamp.model.GB gb, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    java.util.Date date = new java.util.Date();
    gb.settime_stamp(dateFormat.format(date));
    this.GBService.add(gb);
    redirectAttributes.addFlashAttribute("message", "추가되었습니다.");
    return "redirect:/";
}