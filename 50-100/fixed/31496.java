@java.lang.Override
protected queries.IQuery<java.util.List<model.Customer>> createQuery(javax.swing.JFormattedTextField[] textFields) {
    java.lang.String Date = textFields[0].getText().replace("-", "");
    int ManagerID = ((int) (textFields[1].getValue()));
    return new queries.LateCheckOut(Date, ManagerID);
}