@org.junit.Test
public void testGetUpdateQuery() throws java.lang.Exception {
    assertEquals(dbBundle.getString("USER.UPDATE"), "UPDATE restaurant.user SET name = ?, surname = ?, login = ?, password  = ?, email = ?, role = ?, pay_card_id = ? WHERE id = ?");
}