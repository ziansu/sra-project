@java.lang.Override
public boolean deleteReference(int id) {
    com.github.superryhma.miniprojekti.dbc.Dbc.open();
    com.github.superryhma.miniprojekti.dao.impl.db.models.ProjectReference pr = com.github.superryhma.miniprojekti.dao.impl.db.models.ProjectReference.findFirst("id = ?", id);
    com.github.superryhma.miniprojekti.dbc.Dbc.close();
    deleteTags(pr);
    deleteAttributes(pr);
    com.github.superryhma.miniprojekti.dbc.Dbc.open();
    pr.delete();
    com.github.superryhma.miniprojekti.dbc.Dbc.close();
    return true;
}