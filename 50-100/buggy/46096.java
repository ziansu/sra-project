public void setBookingsFilePath(java.lang.String bookingsFilePath) throws java.io.FileNotFoundException, java.io.IOException, javax.xml.bind.JAXBException {
    this.bookingsFilePath = bookingsFilePath;
    javax.xml.bind.JAXBContext jc = javax.xml.bind.JAXBContext.newInstance(uts.wsd.Bookings.class);
    javax.xml.bind.Unmarshaller u = jc.createUnmarshaller();
    java.io.FileInputStream fin = new java.io.FileInputStream(bookingsFilePath);
    bookings = ((uts.wsd.Bookings) (u.unmarshal(fin)));
    fin.close();
}