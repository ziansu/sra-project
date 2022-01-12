@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    if ((ndbnoAssociation.get(i)) != null) {
        java.lang.String ndbno = ndbnoAssociation.get(i);
        if (!(ndbno.equals("invalid"))) {
            doNdbnoSearch(ndbno);
        }
    }
}