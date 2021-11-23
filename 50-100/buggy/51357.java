public void fillGroupForm(ru.stqa.pft.adressbook.model.GroupData groupData) {
    click(org.openqa.selenium.By.name("group_name"));
    type(org.openqa.selenium.By.name("group_name"), groupData.getName());
    click(org.openqa.selenium.By.name("group_header"));
    type(org.openqa.selenium.By.name("group_header"), groupData.getHeader());
    click(org.openqa.selenium.By.name("group_footer"));
    type(org.openqa.selenium.By.name("group_footer"), groupData.getFooter());
}