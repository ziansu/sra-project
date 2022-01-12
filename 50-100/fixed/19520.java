private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
    description = ((java.lang.String) (stream.readObject()));
    deadline = ((java.util.Date) (stream.readObject()));
    startDate = ((java.util.Date) (stream.readObject()));
    endDate = ((java.util.Date) (stream.readObject()));
    check = (((java.lang.Boolean) (stream.readObject()))) ? true : false;
}