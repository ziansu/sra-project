@cucumber.api.java.en.Given(value = "^cashier has entered price for product group$")
public void cashier_has_entered_price_for_product_group() throws java.lang.Throwable {
    cashier_is_on_the_cash_area_site();
    cashier_clicks_on_a_product_group_button();
    cashier_enters_in_the_opened_dialog(10, 0);
    the_article_is_shown_in_the_lis_with_the_price_of(10, 0);
}