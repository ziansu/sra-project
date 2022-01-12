public java.lang.String getPersonDatas() {
    java.lang.System.out.println("Szemelyadatok lekerve");
    Beans.Person p = SingletonDBMgr.getPersonDatas(PersonID);
    return ((p.getVnev()) + " ") + (p.getKnev());
}