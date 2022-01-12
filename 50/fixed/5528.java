@org.springframework.web.bind.annotation.ModelAttribute
public void addingCommonObjects(org.springframework.ui.Model model) {
    if ((com.newsport.controller.HomeController.conn) == null) {
        com.newsport.allegropgraph.Allegrograph alle = new com.newsport.allegropgraph.Allegrograph();
        com.newsport.controller.HomeController.conn = alle.getAGConnection();
    }
}