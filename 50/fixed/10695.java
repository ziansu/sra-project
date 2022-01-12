public java.lang.String getPersonDatas() {
    Beans.Person p = SingletonDBMgr.getPersonDatas(PersonID);
    return ((p.getVnev()) + " ") + (p.getKnev());
}