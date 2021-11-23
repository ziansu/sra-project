public static boolean processNameIncomePair(java.lang.String name, int income) {
    com.tangzhixiong.zjbrohw.Person p = new com.tangzhixiong.zjbrohw.Person(name, income);
    com.tangzhixiong.zjbrohw.Person.personsList.add(p);
    if (com.tangzhixiong.zjbrohw.Person.persons.containsKey(name)) {
        com.tangzhixiong.zjbrohw.Person.persons.get(name).changeIncome(income);
        return false;
    }else {
        com.tangzhixiong.zjbrohw.Person.persons.put(name, p);
        return true;
    }
}