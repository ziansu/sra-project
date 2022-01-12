@org.junit.Test
public void shouldFindPlayersByName() {
    eu.waldonia.ipl.domain.Player p = null;
    p = playerRepository.findPlayerByName("IVA Richards");
    assertNull(p);
    eu.waldonia.ipl.domain.Player kv = new eu.waldonia.ipl.domain.Player();
    kv.name = "IVA Richards";
    playerRepository.save(kv);
    p = playerRepository.findPlayerByName("IVA Richards");
    assertNotNull(p);
}