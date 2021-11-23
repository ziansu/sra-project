@java.lang.Override
public java.lang.Object fromBody(retrofit.mime.TypedInput typedInput, java.lang.reflect.Type type) throws retrofit.converter.ConversionException {
    try {
        return javax.xml.bind.JAXB.unmarshal(typedInput.in(), java.lang.Class.forName(type.getTypeName()));
    } catch (java.io.IOException e) {
        e.printStackTrace(java.lang.System.out);
        return null;
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
        return null;
    }
}