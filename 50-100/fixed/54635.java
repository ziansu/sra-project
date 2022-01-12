public java.util.List<edu.oakland.cse480.mvc.models.BarDrinkOrder> getDrinkOrdersByBarId(int bar_id) {
    try {
        return this.jdbcPostgres.query("select drinkorder.id, blah, blah, blah from drinkorder left join drink on drink.id = drinkorder.drink_id where drinkorder.bar_id = ? order by drinkorder.time_placed", new java.lang.Object[]{ bar_id }, new edu.oakland.cse480.service.BarDrinkOrderService.BarDrinkOrderMapper());
    } catch (java.lang.Exception e) {
        log.info("No drink orders found for bar id {}", bar_id);
        return new java.util.ArrayList<edu.oakland.cse480.mvc.models.BarDrinkOrder>();
    }
}