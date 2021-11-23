@org.junit.Test
public void deletePracownikByID() {
    int id = 5;
    java.lang.System.out.println(("***TEST - deletePracownikById: " + id));
    dao.PracownikDao dao = new dao.PracownikDao();
    boolean result = dao.deletePracownik(id);
    assert result;
    if (result)
        java.lang.System.out.println(("Usunieto pracownika o id: " + id));
    else
        java.lang.System.out.println(("Nie mozna usunac pracownika o id: " + id));
    
    java.lang.System.out.println("-----\n");
}