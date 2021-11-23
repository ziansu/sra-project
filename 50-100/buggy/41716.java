@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<br.com.caelum.argentum.modelo.Negociacao> carrega(java.io.InputStream inputStream) {
    com.thoughtworks.xstream.XStream stream = new com.thoughtworks.xstream.XStream(new com.thoughtworks.xstream.io.xml.DomDriver());
    stream_.alias("negociacao", br.com.caelum.argentum.modelo.Negociacao.class);
    return ((java.util.List<br.com.caelum.argentum.modelo.Negociacao>) (stream.fromXML(inputStream)));
}