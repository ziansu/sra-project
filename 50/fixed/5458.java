public boolean RPGActorTest11() {
    RPGActor a = new RPGActor();
    a.m_name = "sue";
    a.setName("bob");
    return a.m_name.equals("bob");
}