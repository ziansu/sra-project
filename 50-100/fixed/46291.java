@java.lang.Override
public void initiateSynchronisationDialogue() {
    src = FamiliesFactory.eINSTANCE.createFamilyRegister();
    trg = PersonsFactory.eINSTANCE.createPersonRegister();
    resultSrc = srcHelper.familyToString(src);
    resultTrg = trgHelper.personsToString(trg);
    configurator = new org.benchmarx.Configurator<org.benchmarx.examples.familiestopersons.testsuite.Decisions>();
    propagation = () -> {
    };
}