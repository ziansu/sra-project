@org.junit.Test
public void b_testModifyRoomQuantity() {
    this.addOrder();
    order.ResultMessage rm = order.modifyRoomQuantity(RoomType.DoubleRoom, 1);
    org.junit.Assert.assertEquals(ResultMessage.SUCCESS, rm);
    rm = order.modifyRoomQuantity(RoomType.SingleRoom, 1);
    org.junit.Assert.assertEquals(ResultMessage.FAILED, rm);
}