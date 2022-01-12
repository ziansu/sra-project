public com.qa.smurf.entities.LineItems readLineItems(com.qa.smurf.entities.LineItems p) {
    java.util.ArrayList<com.qa.smurf.entities.LineItems> lineitems = new java.util.ArrayList<com.qa.smurf.entities.LineItems>();
    lineitems = initialData.getLineItems();
    for (int i = 0; i < (lineitems.size()); i++) {
        if (lineitems.get(i).equals(p)) {
            return lineitems.get(i);
        }
    }
    return null;
}