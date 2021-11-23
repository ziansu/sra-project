@java.lang.Override
public void buttonClick(cxf.sample.ui.Button.ClickEvent event) {
    cxf.sample.api.dto.PersonDTO person = form.getFieldGroup().getItemDataSource().getBean();
    remove(person);
}