@javax.annotation.PostConstruct
public void init() {
    allKeszKisz = keszKiszFacade.findAll();
    allKeszitmeny = keszitmenyFacade.findAll();
    allKiszereles = kiszerelesFacade.findAll();
    if (!(allKeszitmeny.isEmpty())) {
        keszitmenyID = allKeszitmeny.get(0).getId();
    }
    if (!(allKiszereles.isEmpty())) {
        kiszerelesID = allKiszereles.get(0).getId();
    }
}