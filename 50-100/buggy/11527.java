@javax.annotation.PostConstruct
public void init() {
    allKeszKisz = keszKiszFacade.findAll();
    allKeszitmeny = keszitmenyFacade.findAll();
    allKiszereles = kiszerelesFacade.findAll();
    keszitmenyID = allKeszitmeny.get(0).getId();
    kiszerelesID = allKiszereles.get(0).getId();
}