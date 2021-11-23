@java.lang.Override
protected void execute(final domainapp.fixture.scenarios.ExecutionContext ec) {
    for (domainapp.dom.communicatie.Communicatie communicatie : communicatieRepository.alleCommunicaties()) {
        if (communicatie.getAfzender().equals("klant")) {
            if ((communicatie.getKlant().getEmail()) != null) {
                communicatie.setAfzender(communicatie.getKlant().getEmail());
            }
        }
    }
}