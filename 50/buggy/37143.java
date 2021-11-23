@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public double allIngredientsSnack(com.vstevam.gigabyte.entities.Snack snack) {
    com.vstevam.gigabyte.service.MenuService menuService = new com.vstevam.gigabyte.service.MenuService();
    return menuService.snackPrice(snack);
}