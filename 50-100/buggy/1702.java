@java.lang.Override
public java.lang.String[] getArgArray() {
    java.lang.String[] result;
    if (((extensionList.getValue()) != null) && ((extensionList.getValue().size()) > 1)) {
        result = new java.lang.String[]{ groupNumber.serialize() , extensionList.serialize() };
    }else {
        result = new java.lang.String[]{ groupNumber.serialize() };
    }
    return result;
}