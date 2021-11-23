public java.util.List<edu.neu.cs5200.hotel.main.entity.Hotel> deleteHotel(int hotelId, int hoteluserId) {
    edu.neu.cs5200.hotel.main.dao.HotelDAO hotelDAO = new edu.neu.cs5200.hotel.main.dao.HotelDAO();
    edu.neu.cs5200.hotel.main.entity.Hotel hotel = hotelDAO.getHotelById(hotelId);
    edu.neu.cs5200.hotel.main.dao.HoteluserDAO hoteluserDAO = new edu.neu.cs5200.hotel.main.dao.HoteluserDAO();
    edu.neu.cs5200.hotel.main.entity.Hoteluser hoteluser = hoteluserDAO.getHoteluserById(hoteluserId);
    hoteluser.removeHotel(hotel);
    hoteluserDAO.updateHoteluser(hoteluser);
    return hotelDAO.getAllHotel(hoteluserId);
}