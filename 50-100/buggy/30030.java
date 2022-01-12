@java.lang.Override
public void endElement(final java.lang.String uri, final java.lang.String localName, final java.lang.String name) throws org.xml.sax.SAXException {
    if ((localName.equals("place")) || (localName.equals("transition"))) {
        this.actual.agregarElementoAMatriz(this.matriz);
    }else
        if (localName.equals("arc")) {
            this.actual.agregarElementoAMatriz(this.matriz);
        }
    
}