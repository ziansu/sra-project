@java.lang.Override
public java.lang.String getElement(javax.xml.transform.stream.StreamResult rt) {
    return rt.getWriter().toString().trim();
}