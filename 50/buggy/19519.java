@org.springframework.web.bind.annotation.RequestMapping(value = "/{myEntity}/edit-form1", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.TEXT_HTML_VALUE)
public java.lang.String editForm1(@org.springframework.web.bind.annotation.PathVariable
com.example.MyEntity myEntity, org.springframework.ui.Model model) {
    populateForm(model);
    return "myEntity/edit1";
}