public static void main(java.lang.String[] args) {
    com.util.DatabaseManager dbc = new com.util.DatabaseManager();
    implementations.PersonDatabase pdb = new implementations.PersonDatabase();
    com.util.TableManager tbm = new com.util.TableManager();
    tbm.makeQuery("Test", "SELECT id, first_name, last_name FROM person");
    com.util.TableCreator tblc = new com.util.TableCreator();
    tblc.createTables("prosjekt");
    com.util.ObjectAdder oa = new com.util.ObjectAdder();
}