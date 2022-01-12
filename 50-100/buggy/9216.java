private boolean readHotelSystemIn() {
    java.io.File f = new java.io.File("hotel.save");
    if (f.exists()) {
        try {
            java.io.FileInputStream fin = new java.io.FileInputStream(f);
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fin);
            hs = ((hotelmgmt.HotelSystem) (ois.readObject()));
        } catch (java.lang.Exception ex) {
            java.lang.System.out.println("There was an exception occurr while trying to read in hotelSystem\n");
            return false;
        }
    }
    return true;
}