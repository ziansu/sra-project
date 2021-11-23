@java.lang.Override
public void parseValue(java.lang.String valueString) {
    if (valueString == null) {
        setValue(null);
    }else {
        io.pelle.mango.client.FileVO file = ((io.pelle.mango.client.FileVO) (getValue()));
        if (file == null) {
            file = new io.pelle.mango.client.FileVO();
            setValue(file);
        }
        file.setFileUUID(valueString);
        setValue(file);
    }
}