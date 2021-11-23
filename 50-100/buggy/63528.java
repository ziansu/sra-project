@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/stocks/{id}")
@javax.ws.rs.Produces(value = { "application/json" })
public com.lunaret_seb.hb_lunaret_seb_zoo.stock.Stock detailStock(@javax.ws.rs.PathParam(value = "id")
int id) {
    java.util.List<com.lunaret_seb.hb_lunaret_seb_zoo.stock.Stock> listStock = new java.util.ArrayList<com.lunaret_seb.hb_lunaret_seb_zoo.stock.Stock>();
    listStock.add(new com.lunaret_seb.hb_lunaret_seb_zoo.stock.Stock("Carotte", 300, 500, 1));
    listStock.add(new com.lunaret_seb.hb_lunaret_seb_zoo.stock.Stock("Viande", 300, 1000, 2));
    listStock.add(new com.lunaret_seb.hb_lunaret_seb_zoo.stock.Stock("Poisson", 120, 700, 3));
    com.lunaret_seb.hb_lunaret_seb_zoo.stock.Stock selectedStock = listStock.get(id);
    return selectedStock;
}