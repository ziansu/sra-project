public void fillGroupForm(ru.stqa.pft.adressbook.model.GroupData groupData) {
    type(org.openqa.selenium.By.name("group_name"), groupData.getName());
    type(org.openqa.selenium.By.name("group_header"), groupData.getHeader());
    type(org.openqa.selenium.By.name("group_footer"), groupData.getFooter());
}