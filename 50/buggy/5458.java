public boolean RPGActorTest11() {
    RPGActor a = new RPGActor();
    a.m_name = "sue";
    a.m_name.setName("bob");
    return a.m_name.equals("bob");
}