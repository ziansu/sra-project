@java.lang.Override
public void action() {
    for (controllers.utils.pojo.AsyncMessagePojo.Sales.VenteMagasinPojo pojo : articles)
        new model.VenteMagasin(pojo.getArticle_id(), pojo.getQuantity(), pojo.getPrice(), "eCom", date).save();
    
}