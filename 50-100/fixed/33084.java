public static java.util.ArrayList<func_address_book.People> read() {
    try {
        java.io.File file = new java.io.File("file.xml");
        javax.xml.bind.JAXBContext jaxbContext = javax.xml.bind.JAXBContext.newInstance(func_address_book.RootXML.class);
        javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        func_address_book.RootXML root = ((func_address_book.RootXML) (jaxbUnmarshaller.unmarshal(file)));
        func_address_book.ReadXMLAdressBook.peopleList = root.getPeople();
    } catch (javax.xml.bind.JAXBException e) {
        e.printStackTrace();
        func_address_book.ReadXMLAdressBook.peopleList = null;
    }
    return func_address_book.ReadXMLAdressBook.peopleList;
}