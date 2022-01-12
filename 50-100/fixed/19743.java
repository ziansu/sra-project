public void addObject(java.lang.String name, java.lang.Object o) {
    java.lang.String nameCopy = name;
    int i = 0;
    while (m_Objs.containsKey(nameCopy)) {
        nameCopy = (name + "_") + (i++);
    } 
    m_Objs.put(nameCopy, o);
}