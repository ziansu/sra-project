public java.util.ArrayList<bl.orderbl.OrderVO> searchHotelOrder(bl.orderbl.OrderState os, java.lang.String keyword) {
    blservice.userblservice.UserBLInfo userBLInfo = new bl.blfactory.BLFactoryImpl().getUserBLInfo();
    userBLInfo = new blservice.userblservice.UserBLService_Stub();
    java.lang.String staffID = userBLInfo.getCurrentID();
    java.lang.String hotelID = userBLInfo.getHotelIDByStaffID(staffID);
    return order.searchHotelOrder(hotelID, os, keyword);
}