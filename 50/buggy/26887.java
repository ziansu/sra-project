@org.junit.Test
public void testGetOrderMerchInOrder() {
    java.util.ArrayList<Dtos.OrderMerch> om = instance.getOrderMerchInOrder(2);
    for (Dtos.OrderMerch o : om) {
        java.lang.System.out.println(o);
    }
}