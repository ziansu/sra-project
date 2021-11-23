@org.junit.Test
public void given_business_list_when_clicking_to_the_end_then_handle_amount_of_page_minus_one() {
    int amount_of_pages = java.lang.Integer.parseInt(business_list.displays_amount_of_pages());
    int amount_of_available_pages = business_list.amount_of_available_pages();
    int offset = amount_of_available_pages - amount_of_pages;
    org.junit.Assert.assertEquals(1, offset);
}