public void setBookingsFilePath(java.lang.String bookingsFilePath) throws java.io.FileNotFoundException, java.io.IOException, javax.xml.bind.JAXBException {
    javax.xml.bind.JAXBContext jc = javax.xml.bind.JAXBContext.newInstance(uts.wsd.Bookings.class);
    javax.xml.bind.Unmarshaller u = jc.createUnmarshaller();
    this.bookingsFilePath = bookingsFilePath;
    java.io.FileInputStream fin = new java.io.FileInputStream(bookingsFilePath);
    bookings = ((uts.wsd.Bookings) (u.unmarshal(fin)));
    fin.close();
}